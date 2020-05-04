package com.model2.mvc.service.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.model2.mvc.common.Search;
import com.model2.mvc.common.util.DBUtil;
import com.model2.mvc.service.domain.Product;

public class ProductDAO {

	public ProductDAO() {
	}
	
	public void insertProduct(Product product) throws Exception{
		
		Connection con = DBUtil.getConnection();
		//���� �����ͺ��̽��� ������ ���������� 
		String sql = "INSERT "+
						"INTO PRODUCTS"+
						"VALUES (seq_product_prod_no.nextval,?,?,?,?,?,sysdate)";
		
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, product.getProdName());
		stmt.setString(2, product.getProdDetail());
		stmt.setString(3, product.getManuDate());
		stmt.setInt(4, product.getPrice());
		stmt.setString(5, product.getFileName());
		stmt.executeUpdate();
		//select�� �����Ѱ� sql�� ���� , preparedStatement���� stmt ���Ѱ� db�� �����ִ°�
		con.close();
		//statement ��ü�� ��ȯ�� �� ���� , sql �ٳ����� close�� �ݾ��� 
	}
	
	
	public Product findProduct(int prodNo) throws Exception{

		Connection con = DBUtil.getConnection();

		String sql = "SELECT * "+
				 "FROM PRODUCT WHERE PROD_NO=?";
		
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, prodNo);

		ResultSet rs = stmt.executeQuery();

		Product productVO = null;
		while (rs.next()) {
			productVO = new Product();
			productVO.setProdNo(rs.getInt("PROD_NO"));
			productVO.setProdName(rs.getString("PROD_NAME"));
			productVO.setProdDetail(rs.getString("PROD_DETAIL"));
			productVO.setManuDate(rs.getString("MANUFACTURE_DAY"));
			productVO.setPrice(rs.getInt("PRICE"));
			productVO.setFileName(rs.getString("IMAGE_FILE"));
			productVO.setRegDate(rs.getDate("REG_DATE"));
		}
		
		con.close();

		return productVO;
	}
	
	private int getTotalCount(String sql) throws Exception {
		
		sql = "SELECT COUNT(*) "+
		          "FROM ( " +sql+ ") countTable";
		
		Connection con = DBUtil.getConnection();
		PreparedStatement pStmt = con.prepareStatement(sql);
		ResultSet rs = pStmt.executeQuery();
		
		int totalCount = 0;
		if( rs.next() ){
			totalCount = rs.getInt(1);
		}
		
		pStmt.close();
		con.close();
		rs.close();
		
		return totalCount;
	}
	
	public Map<String, Object> getProductList(Search search) throws Exception{
		//haspmap�� map�� �����ϰ� key value �� �̷�������� 
		Map<String, Object> map= new HashMap<String, Object>();
	System.out.println("--------------before getProductList-----------");
		Connection con = DBUtil.getConnection();
		
		String sql = "select * from PRODUCT ";
		if (search.getSearchCondition() != null) {
			if (search.getSearchCondition().equals("0")) {
				sql += " where PROD_NO='" + search.getSearchKeyword()
						+ "'";
			} else if (search.getSearchCondition().equals("1")) {
				sql += " where PROD_NAME LIKE '%" + search.getSearchKeyword()
						+ "%'";
			} else if (search.getSearchCondition().equals("2")) {
				sql += " where PRICE='" + search.getSearchKeyword()
						+ "'";
			}
		}
		sql += " order by PROD_NO";
	System.out.println("--------------after getProductList-----------");
		
		PreparedStatement stmt = 
			con.prepareStatement(	sql,				
														ResultSet.TYPE_SCROLL_INSENSITIVE,
														//�ѹ� Ŀ���� ������ ������ �ٽ� �ǵ����� ����
														ResultSet.CONCUR_UPDATABLE);
														//resultset����  ������ row�� ���� �ٽ� insert�� ��
														//����Ʈ�� ���� �ʰڴٴ°� 
															
		ResultSet rs = stmt.executeQuery();

		rs.last();
		//Ŀ���� ���ϵڷ� 
		int total = rs.getRow();
		//rs.getRow() ; ��� Ʃ������ �� �� ���� 
		System.out.println(" ��      :" + total);

		//==> TotalCount GET
				int totalCount = this.getTotalCount(sql);
				System.out.println("UserDAO :: totalCount  :: " + totalCount);
				
				//==> CurrentPage �Խù��� �޵��� Query �ٽñ���
				sql = makeCurrentPageSql(sql, search);
				PreparedStatement pStmt = con.prepareStatement(sql);
				/* ResultSet rs = pStmt.executeQuery(); */
		
		
		ArrayList<Product> list = new ArrayList<Product>();
		if (total > 0) {
			for (int i = 0; i < search.getPageSize(); i++) {
				Product vo = new Product();
				vo.setProdNo(rs.getInt("PROD_NO"));
				vo.setProdName(rs.getString("PROD_NAME"));
				vo.setProdDetail(rs.getString("PROD_DETAIL"));
				vo.setManuDate(rs.getString("MANUFACTURE_DAY"));
				vo.setPrice(rs.getInt("PRICE"));
				vo.setFileName(rs.getString("IMAGE_FILE"));
				vo.setRegDate(rs.getDate("REG_DATE"));

				list.add(vo);
				//list�� �������� �߰� 
				
				if (!rs.next())
					break;
			}
		}
		
		//==> totalCount ���� ����
		map.put("totalCount", new Integer(totalCount));
		//==> currentPage �� �Խù� ���� ���� List ����
		map.put("list", list);

		rs.close();
		pStmt.close();
		con.close();

		return map;
	}
	
	public void updateProduct(Product product) throws Exception{
		
		Connection con = DBUtil.getConnection();
		
		String sql = "UPDATE PRODUCT"+
						"SET PROD_NAME=?,PROD_DETAIL=?,MANUFACTURE_DAY=?,PRICE=?,IMAGE_FILE=?"+
						"where PROD_NO=?";
		
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, product.getProdName());
		stmt.setString(2, product.getProdDetail());
		stmt.setString(3, product.getManuDate());
		stmt.setInt(4, product.getPrice());
		stmt.setString(5, product.getFileName());
		stmt.setInt(6, product.getProdNo());
		stmt.executeUpdate();
		
		con.close();
	}
	
	// �Խ��� currentPage Row ��  return 
	private String makeCurrentPageSql(String sql , Search search){
		sql = 	"SELECT * "+ 
					"FROM (		SELECT inner_table. * ,  ROWNUM AS row_seq " +
									" 	FROM (	"+sql+" ) inner_table "+
									"	WHERE ROWNUM <="+search.getCurrentPage()*search.getPageSize()+" ) " +
					"WHERE row_seq BETWEEN "+((search.getCurrentPage()-1)*search.getPageSize()+1) +" AND "+search.getCurrentPage()*search.getPageSize();
		
		System.out.println("UserDAO :: make SQL :: "+ sql);	
		
		return sql;
	}
}


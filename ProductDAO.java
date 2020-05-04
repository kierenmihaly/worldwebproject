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
		//실제 데이터베이스에 쿼리를 보내기위해 
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
		//select문 제외한거 sql문 실행 , preparedStatement부터 stmt 다한거 db에 보내주는것
		con.close();
		//statement 객체를 반환할 때 쓰임 , sql 다끝나면 close로 닫아줌 
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
		//haspmap은 map을 구현하고 key value 로 이루어져있음 
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
														//한번 커서가 지나간 다음에 다시 되돌릴수 없다
														ResultSet.CONCUR_UPDATABLE);
														//resultset으로  가져온 row의 값을 다시 insert나 업
														//데이트로 쓰지 않겠다는것 
															
		ResultSet rs = stmt.executeQuery();

		rs.last();
		//커서를 제일뒤로 
		int total = rs.getRow();
		//rs.getRow() ; 몇개의 튜플인지 알 수 있음 
		System.out.println(" ο      :" + total);

		//==> TotalCount GET
				int totalCount = this.getTotalCount(sql);
				System.out.println("UserDAO :: totalCount  :: " + totalCount);
				
				//==> CurrentPage 게시물만 받도록 Query 다시구성
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
				//list에 아이템을 추가 
				
				if (!rs.next())
					break;
			}
		}
		
		//==> totalCount 정보 저장
		map.put("totalCount", new Integer(totalCount));
		//==> currentPage 의 게시물 정보 갖는 List 저장
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
	
	// 게시판 currentPage Row 만  return 
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


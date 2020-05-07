package com.model2.mvc.service.purchase.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import com.model2.mvc.common.Search;
import com.model2.mvc.common.util.DBUtil;
import com.model2.mvc.service.domain.Purchase;


public class PurchaseDAO {

	public PurchaseDAO() {
	}

	public void insertPurchase(Purchase purchase) throws Exception {

		Connection con = DBUtil.getConnection();
		// 실제 데이터베이스에 쿼리를 보내기위해
		String sql =  "INSERT "+
				"INTO PURCHASES"+
				"VALUES (seq_transaction_tran_no.nextval,?,?,?,?,?,0,sysdate,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, purchase.getBuyer().getUserId());
		stmt.setString(2, purchase.getPaymentOption());
		stmt.setString(3, purchase.getReceiverName());
		stmt.setString(4, purchase.getReceiverPhone());
		stmt.setString(5, purchase.getDivyAddr());
		stmt.setString(6, purchase.getDivyRequest());
		stmt.setString(7, purchase.getDivyDate());
		stmt.setInt(8, purchase.getPurchaseProd().getProdNo());
		
		stmt.executeUpdate();
		// select문 제외한거 sql문 실행
		con.close();
		// statement 객체를 반환할 때 쓰임
	}

	public Purchase findPurchase(int prodNo) throws Exception {

		Connection con = DBUtil.getConnection();

		String sql = "select * from PRODUCT where PROD_NO=?";

		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, prodNo);

		ResultSet rs = stmt.executeQuery();

		Product product = null;
		while (rs.next()) {
			product = new ProductVO();
			product.setProdNo(rs.getInt("PROD_NO"));
			product.setProdName(rs.getString("PROD_NAME"));
			product.setProdDetail(rs.getString("PROD_DETAIL"));
			product.setManuDate(rs.getString("MANUFACTURE_DAY"));
			product.setPrice(rs.getInt("PRICE"));
			product.setFileName(rs.getString("IMAGE_FILE"));
			product.setRegDate(rs.getDate("REG_DATE"));
		}

		con.close();

		return product;
	}

	public HashMap<String, Object> getPurchaseList(Search search) throws Exception {
		// haspmap은 map을 구현하고 key value 로 이루어져있음
		System.out.println("--------------getPurchaseList-----------");
		Connection con = DBUtil.getConnection();

		String sql = "select * from PURCHASE ";
		if (search.getSearchCondition() != null) {
			if (search.getSearchCondition().equals("0")) {
				sql += " where PROD_NO='" + search.getSearchKeyword() + "'";
			} else if (search.getSearchCondition().equals("1")) {
				sql += " where PROD_NAME='" + search.getSearchKeyword() + "'";
			} else if (search.getSearchCondition().equals("2")) {
				sql += " where PRICE='" + search.getSearchKeyword() + "'";
			}
		}
		sql += " order by PROD_NO";

		PreparedStatement stmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
				// 한번 커서가 지나간 다음에 다시 되돌릴수 없다
				ResultSet.CONCUR_UPDATABLE);
		// resultset으로 가져온 row의 값을 다시 insert나 업
		// 데이트로 쓰지 않겠다는것

		ResultSet rs = stmt.executeQuery();

		rs.last();
		int total = rs.getRow();
		System.out.println(" ο      :" + total);

		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("count", new Integer(total));


		ArrayList<Product> list = new ArrayList<Product>();
		if (total > 0) {
			for (int i = 0; i < search.getPageUnit(); i++) {
				Product vo = new Product();
				vo.setProdNo(rs.getInt("PROD_NO"));
				vo.setProdName(rs.getString("PROD_NAME"));
				vo.setProdDetail(rs.getString("PROD_DETAIL"));
				vo.setManuDate(rs.getString("MANUFACTURE_DAY"));
				vo.setPrice(rs.getInt("PRICE"));
				vo.setFileName(rs.getString("IMAGE_FILE"));
				vo.setRegDate(rs.getDate("REG_DATE"));

				list.add(vo);
				if (!rs.next())
					break;
			}
		}
		System.out.println("DAO list======> " + list);
		System.out.println("list.size() : " + list.size());
		map.put("list", list);
		System.out.println("map().size() : " + map.size());

		con.close();

		return map;
	}

	public void updatePurchase(Purchase purchase) throws Exception {

		Connection con = DBUtil.getConnection();

		String sql = "update PRODUCT set PROD_NAME=?,PROD_DETAIL=?,MANUFACTURE_DAY=?,PRICE=?,IMAGE_FILE=? where PROD_NO=?";

		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, purchase.getProdName());
		stmt.setString(2, purchase.getProdDetail());
		stmt.setString(3, purchase.getManuDate());
		stmt.setInt(4, purchase.getPrice());
		stmt.setString(5, purchase.getFileName());
		stmt.setInt(6, purchase.getProdNo());
		stmt.executeUpdate();

		con.close();
	}

	public void updateTranCode(Purchase purchase) throws Exception {
		
		
	}
}

package jw;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;



public class UserDao {
	
	public void getUser(UserVO userVO) throws SQLException, NamingException {
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//con = DriverManager.getConnection(dburl,dbuser,dbpwd);
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/ora");
			
			//con = OracleConnectionPool.getInstance().getConnection();
			con =ds.getConnection();
			
			pStmt = con.prepareStatement("INSERT INTO persnal_info values(?,?,?)");
			
			pStmt.setString(1,userVO.getName());
			pStmt.setString(2,userVO.getSex());
			pStmt.setString(3,userVO.getBirth());
				
			
			
			int com = pStmt.executeUpdate();
			
			
			if(com == 1) {
				System.out.println("데이터입력 완료");
				
				
			}
			
			
	} 
			finally{
			if(rs != null) {
				try {
					rs.close();
				}catch(Exception e1) {}
			}
		if(pStmt != null) {
			try {
				pStmt.close();
			}catch(Exception e2) {}
			
		}if(con!= null) {
			try {
				con.close();
			}catch(Exception e3) {}
		}
		
		
	}
	}// end of getUser
}

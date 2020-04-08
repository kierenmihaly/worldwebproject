

import java.sql.*;

public class Example01 {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		String createSql =
				"CREATE TABLE member"+
						"(no		NUMBER,"+
						"id		VARCHAR2(10),"+
						"pwd	VARCHAR2(10))";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.driver loading OK");
			con=DriverManager.getConnection(url,"scott","tiger");
			System.out.println("2. connection 인스턴스 생성 완료");
			stmt = con.createStatement();
			System.out.println("3. statement 객체 생성 완료");
			System.out.println("::QUERY 전송결과 :"+stmt.executeUpdate(createSql));
			System.out.println("4. query 전송완료");
		}catch(ClassNotFoundException e) {
			System.out.println("\n==>Driver Loading시 Exception 발생\n");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("\n==>JDBC 절차 중 Exception 발생 :"+e.getErrorCode());
			e.printStackTrace();
		}finally {
			try {
				if(stmt !=null)			stmt.close();
				if(con !=null)			con.close();
			}catch(SQLException e) {
				System.out.println("\n==>JDBC 절차 중 Exception 발생 :"+e.getErrorCode());
				e.printStackTrace();
			}
		}

	}

}

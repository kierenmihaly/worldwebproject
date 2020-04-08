

import java.sql.*;

public class ConnectionTest02 {

		public static void main(String[] args)throws Exception{
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "scott";
			String pwd = "tiger";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,user,pwd);
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT*FROM product");
			
			rs.next();
			
			String productName = rs.getString("p_name");
			int productPrice = rs.getInt("p_price");
			
			System.out.println("상품명:"+productName);
			System.out.println("가격:"+productPrice);
			
			rs.close();
			stmt.close();
			con.close();
		}
}

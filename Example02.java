


import java.sql.*;
import java.util.Scanner;

public class Example02 {
	
	//MM
	public static void main(String[ ]args)throws Exception{
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url,"scott","tiger");
		Statement stmt = con.createStatement();
		
		Scanner scanner = new Scanner(System.in);
		int no = scanner.nextInt();
		String id = scanner.next();
		String pwd = scanner.next();
		
		String sql ="INSERT into member values("+no+",'"+id+"', '"+pwd+"')";
		
		int i = stmt.executeUpdate(sql);
		
		
		
	
		System.out.println("1번 insert 유무 :"+i+"개의 행이 만들어졌습니다.");
		
	}//main
}//class

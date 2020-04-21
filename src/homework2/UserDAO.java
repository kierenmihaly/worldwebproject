package homework2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class UserDAO {

	// constructor
	public UserDAO() {
	}

	/// Method
	public void addUser(UserVO userVO) {

		Connection con = null;
		PreparedStatement pStmt = null;
		// ResultSet rs = null;
		int i=0;

		try {

			// con = OracleConnectionPool.getInstance().getConnection();

			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/ora");

			con = ds.getConnection();

			// statement
			pStmt = con.prepareStatement("INSERT INTO persnal_info (name, sex, birth) VALUES(?, ?, ?)");
			pStmt.setString(1, userVO.getName());
			pStmt.setString(2, userVO.getSex());
			pStmt.setString(3, userVO.getBirth());

			// result
			// rs=pStmt.executeQuery();
			i = pStmt.executeUpdate();

			if (i == 1) {
				System.out.println("insert success");
				userVO.setActive(true);

			} else {

				System.out.println("insert failed");

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pStmt != null) {
				try {
					pStmt.close();
				} catch (Exception e2) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e3) {
				}
			}
		}
	}

	public void getUser(UserVO userVO) {

		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;

		try {

			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/ora");

			con = ds.getConnection();

			// statement
			pStmt = con.prepareStatement("SELECT * FROM persnal_info WHERE ID=? AND PWD=?");

			pStmt.setString(1, userVO.getName());
			pStmt.setString(2, userVO.getSex());

			// resultset
			rs = pStmt.executeQuery();

			if (rs.next()) {
				userVO.setActive(true);
				userVO.setSex(rs.getString("sex"));
				userVO.setBirth(rs.getString("birth"));

			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e1) {
				}
			}
			if (pStmt != null) {
				try {
					pStmt.close();
				} catch (Exception e2) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e3) {
				}
			}

		}

	}
}

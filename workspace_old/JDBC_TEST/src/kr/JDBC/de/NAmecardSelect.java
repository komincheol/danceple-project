package kr.JDBC.de;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NAmecardSelect {
	static final String URL = "jdbc:oracle:thin:@70.12.50.50:1521:XE";
	static final String USER = "dream01";
	static final String PASS = "catcher";

	public static void main(String[] args) {
		// JDBC 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT NO,NAME,MOBILE,EMAIL,COMPANY " + "FROM NAMECARD " + "ORDER BY NO DESC";
		try {
			// Connection 맺기
			con = DriverManager.getConnection(URL, USER, PASS);
			// SQL 실행
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String mobile = rs.getString("mobile");
				String email = rs.getString("email");
				String company = rs.getString("company");
				System.out.println(no + "|" + name + "|" + mobile + "|" + email + "|" + company);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(sql);
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

package kr.JDBC.de;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OrclConnection {
	private static Connection orclConn;

	private OrclConnection() {

	}
	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		if (orclConn == null) {
			// dbConn이 null이면, 연결된 것이 없으니 연결해야한다.
			String url = "jdbc:oracle:thin:@70.12.50.50:1521:XE";
			String user = "dream30";
			String pass = "catcher";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			orclConn = DriverManager.getConnection(url, user, pass);
		}
		return orclConn;
	}
	
	public static void close() throws SQLException {

		if (orclConn != null) {
			if (!orclConn.isClosed()) {
				orclConn.close();
			}
		}
	}
}

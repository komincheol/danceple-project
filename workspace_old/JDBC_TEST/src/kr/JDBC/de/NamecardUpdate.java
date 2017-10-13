package kr.JDBC.de;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class NamecardUpdate {
	static final String URL = "jdbc:oracle:thin:@70.12.50.50:1521:XE";
	static final String USER = "dream01";
	static final String PASS = "catcher";

	public static void main(String[] args) {
		 try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	        } catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        Connection con = null;
	        Statement stmt = null;
	        String sql = "UPDATE NAMECARD " +
	            "SET EMAIL ='gildonghong@gmail.org' " +
	            "WHERE NO = 1";
	        try {
	            // Connection ¸Î±â
	            con = DriverManager.getConnection(URL, USER, PASS);
	            stmt = con.createStatement();
	            stmt.executeUpdate(sql);
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	            System.out.println(sql);
	        } finally {
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

package kr.JDBC.de;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

public class CallableStatementTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Connection cn = null;
		CallableStatement cst = null;

		int empno;
		String ename;

		try {
			cn = OrclConnection.getConnection();

			cst = cn.prepareCall("{call p1(?,?)}");

			System.out.println("Enter EMPNO please : ");
			empno = Integer.parseInt(sc.nextLine());

			System.out.println("Enter NAME please : ");
			ename = sc.nextLine();

			cst.setInt(1, empno);
			cst.setString(2, ename);

			int r = cst.executeUpdate();

			if (r > 0)
				System.out.println("Details Inserted.");

			cn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (cst != null)
					cst.close();

				if (cn != null)
					cn.close();
			} catch (Exception e) {
			}
		}

	}
}

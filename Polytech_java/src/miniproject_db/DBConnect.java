package miniproject_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;

public class DBConnect {

	// 0. JDBC ����̹�, URL, ���̵�, ��й�ȣ ����
	static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3305/mydb"; // ��Ű����:��Ʈ��ȣ
	static String id = "root";
	static String pw = "1234";
	static Vector<Test> vtest = null;

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Test t;
		vtest = new Vector<Test>();

		String sql = "SELECT * FROM test ORDER BY uname";

		Connection con = null;
		PreparedStatement pstmt = null;

		Class.forName(jdbcDriver);

		con = DriverManager.getConnection(url, id, pw);

		pstmt = con.prepareStatement(sql); 

		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			t = new Test();
			System.out.println(rs.getString("uname") + ", " + rs.getString("email"));
			System.out.println();
			t.setUname(rs.getString("uname"));
			t.setEmail(rs.getString("email"));
			vtest.add(t);
			for (Test tt : vtest) {
				System.out.println(tt);
			}
		}

		System.out.println("=========================");
		for (Test tt : vtest) {
			System.out.println(tt.getUname() + ", " + tt.getEmail());
		}

		pstmt.close();
		con.close();
	}
}

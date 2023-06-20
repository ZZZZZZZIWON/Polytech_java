package midprojectB;

import java.sql.*;
import java.util.*;

public class EventRegist {
	Scanner scanner = new Scanner(System.in);
	
	String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	String jdbcUrl = "jdbc:mysql://localhost:3305/mydb";
	Connection conn;
	
	PreparedStatement pstmt;
	ResultSet rs;
	
	// �씠踰ㅽ듃 �벑濡� 硫붿꽌�뱶
	public EventRegist() {
		System.out.println("## �씠踰ㅽ듃 �벑濡앹쓣 �쐞�빐 �씠由꾧낵 �씠硫붿씪�쓣 �엯�젰�븯�꽭�슂");
		System.out.print("�씠由�: ");
		String uname = scanner.next();
		System.out.print("�씠硫붿씪: ");
		String email = scanner.next();
		
		connectDB();
		registUser(uname,email);
		printList();
		closeDB();
	}
	
	// DB�뿰寃� 硫붿꽌�뱶
	public void connectDB() {
		try {
			// 1�떒怨�: JDBC�뱶�씪�씠踰� 濡쒕뱶
			Class.forName(jdbcDriver);
			
			// 2�떒怨�: �뜲�씠�꽣踰좎씠�뒪 �뿰寃�
			conn = DriverManager.getConnection(jdbcUrl,"root","1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// DB �뿰寃� 醫낅즺 硫붿꽌�뱶
	public void closeDB() {
		try {
			// 6�떒怨�: �뿰寃� �빐�젣
			pstmt.close();
			rs.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void registUser(String uname, String email) {
		String sql = "insert into event values(?,?)";
		try {
			// 3�떒怨�: Statement �깮�꽦
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uname);
			pstmt.setString(2, email);
			
			// 4�떒怨�: SQL 臾� �쟾�넚
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void printList() {
		System.out.println("# �벑濡앹옄 紐낅떒");
		String sql = "select * from event";
		try {
			pstmt = conn.prepareStatement(sql);
			
			// 5�떒怨�: 寃곌낵諛쏄린
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("uname")+","+rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		EventRegist er = new EventRegist();
	}
}
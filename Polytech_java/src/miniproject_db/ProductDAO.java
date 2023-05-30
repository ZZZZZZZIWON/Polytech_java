package miniproject_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {

	String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3305/mydb"; 
	String id = "root";
	String pw = "1234";
	Product p; // 상품 정보를 위한 객체
	ArrayList<Product> product_test = null;

	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	// DB 연결 메서드
	public void connectDB() {

		try {
			Class.forName(jdbcDriver);
			con = DriverManager.getConnection(url, id, pw);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// DB 종료 메서드

	public void closeDB() {
		try {
			pstmt.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 전체 Product 리스트로 구성된 ArrayList를 리턴 (SELECT ALL)

	public ArrayList<Product> getAll() {
		 

	
	 }

	// 파라미터에서 pcode 에 해당하는 상품을 리턴 (SELECT ONE)
	public Product getOne(int pcode) {
		 
		connectDB();

		sql = "SELECT * FROM PRODUCT WHERE PCODE= ?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, pcode);
			rs = pstmt.executeQuery();
			rs.next();
			
			// todo : CellPhone 또는 SmartTV로 분류해서 값을 넣어주기
			p = new CellPhone();
			p = new SmartTV();
			
			p.setPcode(rs.getInt("pcode"));
			p.setPname(rs.getString("pname"));
			p.setPrice(rs.getInt("price"));
			p.setMf(rs.getString("mf"));
			

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

		finally {
			closeDB();
		}
		return p;
	 }

	// Product 객체 내용을 DB에 저장 (INSERT)

	public boolean insertProd(Product product) {

		connectDB();

		sql = "INSERT INTO PRODUCT (PNAME, PRICE, MF) VALUES(?, ?, ?)";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, product.getPname());
			pstmt.setInt(2, product.getPrice());
			pstmt.setString(3, product.getMf());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		finally {
			closeDB();
		}
		return true;
	}

	// Product 객체에서 pcode에 해당하는 객체를 DB에서 삭제 (DELETE)

	public boolean deleteProd(int pcode) {

		connectDB();

		sql = "DELETE FROM PRODUCT WHERE PCODE = ?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, pcode);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		finally {
			closeDB();
		}
		return true;
	}
	

	// Product 객체의 내용을 업데이트 (UPDATE)

	public boolean updateProd(Product product) {
		connectDB();

		sql = "UPDATE PRODUCT SET PNAME = ?, PRICE=?, MF=? WHERE PCODE=?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, product.getPname());
			pstmt.setInt(2, product.getPrice());
			pstmt.setString(3, product.getMf());
			pstmt.setInt(4, product.getPcode());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		finally {
			closeDB();
		}
		return true;
	}
	
}

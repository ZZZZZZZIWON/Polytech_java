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
	Product p; // ��ǰ ������ ���� ��ü
	ArrayList<Product> product_test = null;

	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	// DB ���� �޼���
	public void connectDB() {

		try {
			Class.forName(jdbcDriver);
			con = DriverManager.getConnection(url, id, pw);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// DB ���� �޼���

	public void closeDB() {
		try {
			pstmt.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ��ü Product ����Ʈ�� ������ ArrayList�� ���� (SELECT ALL)

	public ArrayList<Product> getAll() {
		 

	
	 }

	// �Ķ���Ϳ��� pcode �� �ش��ϴ� ��ǰ�� ���� (SELECT ONE)
	public Product getOne(int pcode) {
		 
		connectDB();

		sql = "SELECT * FROM PRODUCT WHERE PCODE= ?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, pcode);
			rs = pstmt.executeQuery();
			rs.next();
			
			// todo : CellPhone �Ǵ� SmartTV�� �з��ؼ� ���� �־��ֱ�
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

	// Product ��ü ������ DB�� ���� (INSERT)

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

	// Product ��ü���� pcode�� �ش��ϴ� ��ü�� DB���� ���� (DELETE)

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
	

	// Product ��ü�� ������ ������Ʈ (UPDATE)

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

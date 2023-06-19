package midproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import midproject.Product;
import miniproject_db.CellPhone;
import miniproject_db.SmartTV;

public class ProductDAO {

	// driver, url, id, pw
	String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3305/mydb"; 
	String id = "root";
	String pw = "1234";
	
	// conn, pstmt, rs, sql
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	// ArayList<Product>
	ArrayList<Product> products = null;
	Vector<Integer> prcodeList = null;
	
	// connectDB : DB ����
	public void connectDB( ) {
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(url, id, pw);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// closeDB : DB ����
	public void closeDB() {
		try {
			pstmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// insertProd : ��ǰ ��� ���
	public boolean insertProd(Product product) {
		connectDB();

		sql = "INSERT INTO PRODUCT (PRNAME, PRICE, MANUFACTURE) VALUES(?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getPrname());
			pstmt.setInt(2, product.getPrice());
			pstmt.setString(3, product.getManufacture());
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
	
	// deleteProd : ��ǰ ���� ���
	public boolean deleteProd(int prcode) {
		connectDB();

		sql = "DELETE FROM PRODUCT WHERE PRCODE = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, prcode);
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
	
	// updateProd : ��ǰ���� ������Ʈ
	public boolean updateProd(Product product) {
		connectDB();

		sql = "UPDATE PRODUCT SET PRNAME = ?, PRICE=?, MANUFACTURE=? WHERE PRCODE=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getPrname());
			pstmt.setInt(2, product.getPrice());
			pstmt.setString(3, product.getManufacture());
			pstmt.setInt(4, product.getPrcode());
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
	
	// getAll : ��ü ��ǰ ������ ��ȸ�ϴ� ���
	public ArrayList<Product> getAll() {
		connectDB();
		Product product = null;

		sql = "SELECT * FROM PRODUCT";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
	
			while(rs.next()) {
				product = new Product();
				product.setPrcode(rs.getInt("prcode"));
				product.setPrname(rs.getString("prname"));
				product.setPrice(rs.getInt("price"));
				product.setManufacture(rs.getString("manufacture"));
				
				products.add(product);
				
				// TODO for GUI
				// Combo�ڽ��� product�� ��ȣ�� �ʿ���
				prcodeList.add(rs.getInt("prcode"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

		finally {
			closeDB();
		}
		return products;
	}
	
	// getOne : ��ǰ�ڵ�� ��ǰ ������ ��ȸ�ϴ� ���
	public Product getOne(int prcode) {
		connectDB();
		Product product = null;

		sql = "SELECT * FROM PRODUCT WHERE PRCODE= ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, prcode);
			rs = pstmt.executeQuery();
			rs.next();
			
			product = new Product();
			product.setPrcode(rs.getInt("prcode"));
			product.setPrname(rs.getString("prname"));
			product.setPrice(rs.getInt("price"));
			product.setManufacture(rs.getString("manufacture"));
			

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

		finally {
			closeDB();
		}
		return product;
	 }
		
	}


package test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conn
{
	static Connection conn = null;

	public Conn(String id, String pw) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB ���� �Ϸ�");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static Connection getConnect(String id,String pw) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB ���� �Ϸ�");
			
			return conn;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
/*
	public ResultSet selectQuery(String query) {
		ResultSet rset = null;
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();

			return rset;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int updateQuery(String query) {

		try {
			pstmt = conn.prepareStatement(query);
			int result = pstmt.executeUpdate();

			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
	*/
	public void close() {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

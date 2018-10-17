/*package com.bookstore.jdbc.datasource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.bookstore.mvc.MyDataSourceFactory;

public class DataSourceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testMySqlDataSource();
	}
	private static void testMySqlDataSource() {
		DataSource ds = null;
		ds = MyDataSourceFactory.getMySQLDataSource();
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = ds.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select book_id, title from tb_books");
			while (rs.next()) {
				System.out.println("Book ID="+rs.getInt("book_id")+",Title="+rs.getString("title"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt!=null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
*/
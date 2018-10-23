package com.bookstore.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;


/*
 * Model Layer: BookModel
 */
public class BookModel {
	BookModel(){
		
	}
	//---------------------ADD-----------------------------------
	/*
	 * To insert the record into the database 
	 * @param book
	 * @throws SQLException 
	 */
	public int insert(BookVO book) throws SQLException {
		DataSource datasource = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int cnt = 0;
		try {
			datasource = MyDataSourceFactory.getMySQLDataSource();
			connection = datasource.getConnection();
			preparedStatement=
					connection.prepareStatement("INSERT INTO tb_books "
							+ "(title,author_id,category_id,cover,review,price,no_of_copies_current) "
							+ "values(?,?,?,?,?,?,?)");
			int i=0;
			preparedStatement.setString(++i, book.getTitle());
			preparedStatement.setString(++i, book.getAuthorId());
			preparedStatement.setString(++i, book.getCategoryId());
			preparedStatement.setBlob(++i, book.getCover());
			preparedStatement.setString(++i, book.getReview());
			preparedStatement.setInt(++i, book.getPrice());
			preparedStatement.setInt(++i,book.getNoOfCopiesCurrent());
			
			cnt=preparedStatement.executeUpdate();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			if (preparedStatement!=null) {
				preparedStatement.close();
			}
			if (connection != null) {
				connection.close();
			}	
		}
		return cnt;
	}
	
	/*
	 * To query database
	 * @param query statement
	 * @throws SQLException 
	 */
	public ArrayList<BookVO> search(String query) throws SQLException {
		
		ArrayList<BookVO> searchResult = new ArrayList<BookVO>();
	
		DataSource datasource = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet=null;
		BookVO result=null;
		int cnt = 0;
		try {
			datasource = MyDataSourceFactory.getMySQLDataSource();
			connection = datasource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				result = new BookVO();
				result.setBookId(resultSet.getInt("book_id"));
				result.setTitle(resultSet.getString("title"));
				result.setAuthorId(resultSet.getString("author_id"));
				result.setCategoryId(resultSet.getString("category_id"));
				result.setCover(resultSet.getBlob("cover"));
				result.setReview(resultSet.getString("review"));
				result.setPrice(resultSet.getInt("price"));
				result.setNoOfCopiesCurrent(resultSet.getInt("no_of_copies_current"));
				result.setShelfId(resultSet.getInt("shelf_id"));
				
				searchResult.add(result);
				cnt++;
			}
			if (cnt > 0)
				return searchResult;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (resultSet!=null) {
				resultSet.close();
			}
			if (preparedStatement!=null) {
				preparedStatement.close();
			}
			if (connection != null) {
				connection.close();
			}	
		}
		return null;
	}
	
	/*
	 * To search book by ID
	 * @param book_id
	 * @throws SQLException 
	 */
	public ArrayList<BookVO> searchByID(int bookID) throws SQLException {
		
		String query="SELECT * FROM tb_books where book_id = " + bookID + ";";
		ArrayList<BookVO> searchResult = new ArrayList<BookVO>();
		searchResult = search(query);
		return searchResult;
	}
	
	/*
	 * To search book by title
	 * @param book_title
	 * @throws SQLException 
	 */
	public ArrayList<BookVO> searchByTitle(String title) throws SQLException {
		String query="SELECT * FROM tb_books where title LIKE '%"+title+"%';";
		ArrayList<BookVO> searchResult = new ArrayList<BookVO>();
		searchResult = search(query);
		return searchResult;
	}
	
	/*
	 * To search book by author
	 * @param author
	 * @throws SQLException 
	 */
	public ArrayList<BookVO> searchByAuthor(String author) throws SQLException {
		String query="SELECT * FROM tb_books where author LIKE '%"+author+"%';";
		ArrayList<BookVO> searchResult = new ArrayList<BookVO>();
		searchResult = search(query);
		return searchResult;
	}
	//--------------MODIFY----------------------------------------
	public boolean modify(BookVO book) throws SQLException{
		String statement = "UPDATE tb_books SET title='"+book.getTitle()+"',"
				+ "author='"+book.getAuthorId()+"',";
		return true;
	}
	//--------------DELETE----------------------------------------
}

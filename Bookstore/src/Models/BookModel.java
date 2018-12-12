package Models;

import Entities.Books;
import Helper.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookModel {
    private DBUtils database = new DBUtils();
    private Connection connection = null;

    public BookModel() throws SQLException {
        connection = database.getConnection();
    }

    public List<Books> getAllBookList() throws SQLException {
        String selectAllBook = "SELECT * FROM books";
        ResultSet resultSet = database.ExecuteQuerySQLStatement(selectAllBook);
        List<Books> allBooks = new ArrayList<Books>();
        allBooks = ResultSetToList(resultSet);

        return allBooks;
    }

    public Books getBook(int id) throws SQLException {
        String getBookByID = "SELECT * FROM books where id = " + id;
        ResultSet resultSet = database.ExecuteQuerySQLStatement(getBookByID);
        resultSet.first();
        String title = resultSet.getString("title");
        String author = resultSet.getString("author");
        String genre = resultSet.getString("genre");
        String publisher = resultSet.getString("publisher");
        String isbn = resultSet.getString("isbn");
        Integer publicationYear = resultSet.getInt("publicationYear");
        Integer price = resultSet.getInt("price");
        Integer availableQuantity = resultSet.getInt("availableQuantity");

        Books book = new Books(title, author, genre, publisher, isbn, publicationYear, price, availableQuantity);
        return book;
    }

    public List<Books> getBook(String title) throws SQLException {
        String selectBookByTitle = "SELECT * FROM books where title like '%" + title + "%'";
        ResultSet resultSet = database.ExecuteQuerySQLStatement(selectBookByTitle);
        List<Books> resultList = new ArrayList<Books>();
        resultList = ResultSetToList(resultSet);
        return resultList;
    }

    public void addBook(Books book) {
        String isbn = book.getIsbn();
        String title = book.getTitle();
        String author = book.getAuthors();
        String publisher = book.getPublishers();
        int publicationYear = book.getPublicationYear();
        int price = book.getPrice();
        int availableQuantity = book.getAvailableQuantity();
        String genre = book.getGenres();
        String bookValue = "(\"" + isbn + "\",\"" + title + "\",\"" + author + "\",\"" + publisher + "\"," + publicationYear + "," + price + "," +
                availableQuantity + ",\"" + genre + "\")";
        String addBookSQL = "INSERT INTO books (isbn, title, author, publisher, publicationYear," +
                "price, availableQuantity,genre)" +
                " VALUES " + bookValue + ";";
        database.ExecuteCRUDSQLStatement(addBookSQL);
    }

    public void removeBook(int id) {
        String deleteBookSQL = "DELETE FROM books WHERE id=" + id;
        database.ExecuteCRUDSQLStatement(deleteBookSQL);
    }

    public void updateBook(int id, Books book) {
        String isbn = book.getIsbn();
        String title = book.getTitle();
        String author = book.getAuthors();
        String publisher = book.getPublishers();
        int publicationYear = book.getPublicationYear();
        int price = book.getPrice();
        int availableQuantity = book.getAvailableQuantity();
        String genre = book.getGenres();
        String set = "SET isbn=\"" + isbn + "\", " +
                "title=\"" + title + "\", " +
                "author=\"" + author + "\", " +
                "publisher=\"" + publisher + "\", " +
                "publicationYear=" + publicationYear + ", " +
                "price=" + price + ", " +
                "availableQuantity=\"" + availableQuantity + "\", " +
                "genre=\"" + genre + "\"";
        String updateBookSQL = "UPDATE books " + set + " WHERE id=" + id;
        System.out.println(updateBookSQL);
        database.ExecuteCRUDSQLStatement(updateBookSQL);
    }

    //-----------HELPER-------------------------------------------------------------------------------------
    public List<Books> ResultSetToList(ResultSet resultSet) throws SQLException {
        List<Books> list = new ArrayList<Books>();
        while (resultSet.next()) {
            String title = resultSet.getString("title");
            String author = resultSet.getString("author");
            String genre = resultSet.getString("genre");
            String publisher = resultSet.getString("publisher");
            String isbn = resultSet.getString("isbn");
            Integer publicationYear = resultSet.getInt("publicationYear");
            Integer price = resultSet.getInt("price");
            Integer availableQuantity = resultSet.getInt("availableQuantity");
            Books book = new Books(title, author, genre, publisher, isbn, publicationYear, price, availableQuantity);
            list.add(book);
        }
        return list;
    }
}

package Models;

import Entities.Authors;
import Helper.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorModel {
    private DBUtils database = new DBUtils();
    private Connection connection = null;

    public AuthorModel() throws SQLException {
        connection = database.getConnection();
    }

    public List<Authors> getAllAuthorList() throws SQLException {
        String selectAllAuthor = "SELECT * FROM authors";
        ResultSet resultSet = database.ExecuteQuerySQLStatement(selectAllAuthor);
        List<Authors> allAuthors = new ArrayList<Authors>();
        allAuthors = ResultSetToList(resultSet);
        return allAuthors;
    }

    public Authors getAuthor(int id) throws SQLException {
        String getAuthorByID = "SELECT * FROM authors where id = " + id;
        ResultSet resultSet = database.ExecuteQuerySQLStatement(getAuthorByID);
        resultSet.first();
        String firstName = resultSet.getString("firstName");
        String lastName = resultSet.getString("lastName");
        Authors author = new Authors(firstName, lastName);
        return author;
    }

    public List<Authors> getAuthor(String name) throws SQLException {
        String selectAuthorByName = "SELECT * FROM authors WHERE firstName LIKE '%" + name + "%'" +
                " OR lastName LIKE '%\"" + name + "\"%'";
        ResultSet resultSet = database.ExecuteQuerySQLStatement(selectAuthorByName);
        List<Authors> resultList = new ArrayList<Authors>();
        resultList = ResultSetToList(resultSet);
        return resultList;
    }

    public void addAuthor(Authors author) {
        String firstName = author.getFirstName();
        String lastName = author.getLastName();
        String authorValue = "(\"" + firstName + "\",\"" + lastName + "\")";
        String addAuthorSQL = "INSERT INTO authors (firstName, lastName)" +
                " VALUES " + authorValue + ";";
        database.ExecuteCRUDSQLStatement(addAuthorSQL);
    }

    public void removeAuthor(int id) {
        String deleteAuthorSQL = "DELETE FROM authors WHERE id=" + id;
        database.ExecuteCRUDSQLStatement(deleteAuthorSQL);
    }

    public void updateAuthor(int id, Authors author) {
        String firstName = author.getFirstName();
        String lastName = author.getLastName();

        String set = "SET firstName=\"" + firstName + "\", " +
                "lastName=\"" + lastName + "\"";
        String updateAuthorSQL = "UPDATE authors " + set + " WHERE id=" + id;
        database.ExecuteCRUDSQLStatement(updateAuthorSQL);
    }

    //-----------HELPER-------------------------------------------------------------------------------------
    public List<Authors> ResultSetToList(ResultSet resultSet) throws SQLException {
        List<Authors> list = new ArrayList<Authors>();
        while (resultSet.next()) {
            String firstName = resultSet.getString("firstName");
            String lastName = resultSet.getString("lastName");
            Authors author = new Authors(firstName, lastName);
            list.add(author);
        }
        return list;
    }
}

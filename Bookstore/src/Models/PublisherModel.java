package Models;

import Entities.Publishers;
import Helper.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PublisherModel {
    private DBUtils database = new DBUtils();
    private Connection connection = null;

    public PublisherModel() throws SQLException {
        connection = database.getConnection();
    }

    public List<Publishers> getAllPublisherList() throws SQLException {
        String selectAllPublisher = "SELECT * FROM publishers";
        ResultSet resultSet = database.ExecuteQuerySQLStatement(selectAllPublisher);
        List<Publishers> allPublishers = new ArrayList<Publishers>();
        allPublishers = ResultSetToList(resultSet);
        return allPublishers;
    }

    public Publishers getPublisher(int id) throws SQLException {
        String getPublisherByID = "SELECT * FROM publishers where id = " + id;
        ResultSet resultSet = database.ExecuteQuerySQLStatement(getPublisherByID);
        resultSet.first();
        String name = resultSet.getString("name");
        Publishers publisher = new Publishers(name);
        return publisher;
    }

    public List<Publishers> getPublisher(String name) throws SQLException {
        String selectPublisherByName = "SELECT * FROM publishers WHERE name LIKE '%" + name + "\"%'";
        ResultSet resultSet = database.ExecuteQuerySQLStatement(selectPublisherByName);
        List<Publishers> resultList = new ArrayList<Publishers>();
        resultList = ResultSetToList(resultSet);
        return resultList;
    }

    public void addPublisher(Publishers publisher) {
        String name = publisher.getName();
        String publisherValue = "(\"" + name + "\")";
        String addPublisherSQL = "INSERT INTO publishers (name)" +
                " VALUES " + publisherValue + ";";
        database.ExecuteCRUDSQLStatement(addPublisherSQL);
    }

    public void removePublisher(int id) {
        String deletePublisherSQL = "DELETE FROM publishers WHERE id=" + id;
        database.ExecuteCRUDSQLStatement(deletePublisherSQL);
    }

    public void updatePublisher(int id, Publishers publisher) {
        String name = publisher.getName();

        String set = "SET name=\"" + name + "\"";
        String updatePublisherSQL = "UPDATE publishers " + set + " WHERE id=" + id;
        database.ExecuteCRUDSQLStatement(updatePublisherSQL);
    }

    //-----------HELPER-------------------------------------------------------------------------------------
    public List<Publishers> ResultSetToList(ResultSet resultSet) throws SQLException {
        List<Publishers> list = new ArrayList<Publishers>();
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            Publishers publisher = new Publishers(name);
            list.add(publisher);
        }
        return list;
    }
}

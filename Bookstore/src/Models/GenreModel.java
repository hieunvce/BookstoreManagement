package Models;

import Entities.Genres;
import Helper.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GenreModel {
    private DBUtils database = new DBUtils();
    private Connection connection = null;

    public GenreModel() throws SQLException {
        connection = database.getConnection();
    }

    public List<Genres> getAllGenreList() throws SQLException {
        String selectAllGenre = "SELECT * FROM genres";
        ResultSet resultSet = database.ExecuteQuerySQLStatement(selectAllGenre);
        List<Genres> allGenres = new ArrayList<Genres>();
        allGenres = ResultSetToList(resultSet);
        return allGenres;
    }

    public Genres getGenre(int id) throws SQLException {
        String getGenreByID = "SELECT * FROM genres where id = " + id;
        ResultSet resultSet = database.ExecuteQuerySQLStatement(getGenreByID);
        resultSet.first();
        String name = resultSet.getString("name");
        Genres genre = new Genres(name);
        return genre;
    }

    public List<Genres> getGenre(String name) throws SQLException {
        String selectGenreByName = "SELECT * FROM genres WHERE name LIKE '%" + name + "\"%'";
        ResultSet resultSet = database.ExecuteQuerySQLStatement(selectGenreByName);
        List<Genres> resultList = new ArrayList<Genres>();
        resultList = ResultSetToList(resultSet);
        return resultList;
    }

    public void addGenre(Genres genre) {
        String name = genre.getName();
        String genreValue = "(\"" + name + "\")";
        String addGenreSQL = "INSERT INTO genres (name)" +
                " VALUES " + genreValue + ";";
        database.ExecuteCRUDSQLStatement(addGenreSQL);
    }

    public void removeGenre(int id) {
        String deleteGenreSQL = "DELETE FROM genres WHERE id=" + id;
        database.ExecuteCRUDSQLStatement(deleteGenreSQL);
    }

    public void updateGenre(int id, Genres genre) {
        String name = genre.getName();

        String set = "SET name=\"" + name + "\"";
        String updateGenreSQL = "UPDATE genres " + set + " WHERE id=" + id;
        database.ExecuteCRUDSQLStatement(updateGenreSQL);
    }

    //-----------HELPER-------------------------------------------------------------------------------------
    public List<Genres> ResultSetToList(ResultSet resultSet) throws SQLException {
        List<Genres> list = new ArrayList<Genres>();
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            Genres genre = new Genres(name);
            list.add(genre);
        }
        return list;
    }
}

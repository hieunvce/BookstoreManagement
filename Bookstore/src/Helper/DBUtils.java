package Helper;

import java.sql.*;

public class DBUtils {
    Connection connection = null;
    Statement statement = null;

    public DBUtils() throws SQLException {
        try {
            connection = DriverManager.getConnection(Config.connection_url,
                    Config.DATABASE_USER_ID, Config.DATABASE_PASSWORD);
        } catch (SQLException ex) {
            System.out.println("The following error has occured: " +
                    ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() throws SQLException {
        connection.close();
    }

    public ResultSet ExecuteQuerySQLStatement(String sql_stmt) {
        try {
            statement = connection.createStatement();
            return statement.executeQuery(sql_stmt);
        } catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
        return null;
    }

    public void ExecuteCRUDSQLStatement(String sql_stmt) {
        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql_stmt);
        } catch (SQLException ex) {
            System.out.println("The following error has occured: " +
                    ex.getMessage());
        }
    }
}

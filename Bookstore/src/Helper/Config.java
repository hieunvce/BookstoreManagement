package Helper;

public class Config {
    public static final String DATABASE_NAME = "bookstore";
    public static final String DATABASE_SERVER = "localhost";
    public static final String DATABASE_PORT = "3306";
    public static final String DATABASE_USER_ID = "hieunguyen";
    public static final String DATABASE_PASSWORD = "3101996";
    public static final String connection_url = "jdbc:mysql://" +
            DATABASE_SERVER + ":" + DATABASE_PORT + "/" + DATABASE_NAME;
}

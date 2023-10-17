package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    public static Connection getMySQLConnection() {
        String hostName = "localhost";
        String dbName = "mybdtest";
        String userName = "root";
        String password = "Oleg5577";
        try {
            return getMySQLConnection(hostName, dbName, userName, password);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getMySQLConnection(String hostName, String dbName,   String userName, String password) throws SQLException,   ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
        return (Connection) DriverManager.getConnection(connectionURL, userName, password);



    }

}


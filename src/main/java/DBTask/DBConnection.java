package DBTask;

import Utils.ReadPropertyFile;

import java.io.IOException;
import java.sql.*;

public class DBConnection {
    public static Connection connectToDB(){
        String connectionString = null;
        try {
            connectionString = ReadPropertyFile.readPropertyFile("Properties/dbconnection.properties", "connectionString");
            return DriverManager.getConnection(connectionString);
        } catch (IOException|SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
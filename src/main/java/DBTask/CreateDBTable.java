package DBTask;

import Utils.ReadPropertyFile;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class CreateDBTable {
    Connection con = DBConnection.connectToDB();
    Statement statement;

    {
        try {
            statement = con.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    DatabaseMetaData databaseMetaData;

    {
        try {
            databaseMetaData = con.getMetaData();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    ResultSet resultSet;

    public void checkAndCreateDBWithTablesAndData() throws SQLException, IOException {
        String dataBaseName = ReadPropertyFile.readPropertyFile("Properties/dbconnection.properties", "dataBaseName");
        String initialTableName = ReadPropertyFile.readPropertyFile("Properties/dbconnection.properties", "initialDataBaseTable");
        String secondTableName = ReadPropertyFile.readPropertyFile("Properties/dbconnection.properties", "secondDataBaseTable");
        ArrayList<String> list = new ArrayList<>();
        resultSet = databaseMetaData.getCatalogs();
        while (resultSet.next()) {
            String listofDatabases = resultSet.getString("TABLE_CAT");
            list.add(listofDatabases);
        }
        if (list.contains(dataBaseName)) {
            System.out.println("Database already exists \n");
        } else {
            statement.executeUpdate("CREATE DATABASE " + dataBaseName);
            System.out.println("Database is created");

            String intialTable = "CREATE TABLE " + dataBaseName + ".dbo." + initialTableName +
                    " (ID INT NOT NULL IDENTITY(1,1), " +
                    " WORD VARCHAR(255))";
            statement.executeUpdate(intialTable);
            System.out.println(initialTableName + " is created in the database...");

            String secondTable = "CREATE TABLE " + dataBaseName + ".dbo." + secondTableName +
                    " (WORD VARCHAR(255))";
            statement.executeUpdate(secondTable);
            System.out.println(secondTableName + " is created in the database...");

            String addingDataToInitialTable = "INSERT INTO " + dataBaseName + ".dbo." + initialTableName + " VALUES ('Word1'), ('Word2'), ('Word1'), ('Word2'), ('Word12'), ('Word1'), ('Word3'), ('Word1'), ('Word2');";
            statement.execute(addingDataToInitialTable);
            System.out.println("Records are inserted...\n\n");

        }
        resultSet.close();
    }
}
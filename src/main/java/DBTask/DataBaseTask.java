package DBTask;

import Utils.ReadPropertyFile;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseTask {
    Connection con = DBConnection.connectToDB();
    Statement statement;

    {
        try {
            statement = con.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    ResultSet resultSet;
    PreparedStatement preparedStatement;

    String dataBaseName;

    {
        try {
            dataBaseName = ReadPropertyFile.readPropertyFile("Properties/dbconnection.properties", "dataBaseName");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public int countWordInTable(String word) throws SQLException {
        resultSet = statement.executeQuery("select count(WORD) as counts from " + dataBaseName + ".dbo.WordList where WORD ='" + word + "'");
        int wordCount = 0;
        while (resultSet.next()) {
            wordCount = Integer.parseInt(resultSet.getString("counts"));
        }

        return wordCount;
    }

    public void writeWordCountInAnotherTable(String word) throws SQLException {
        int countWordAppearance = countWordInTable(word);
        String insertIntoSecondTable = "insert into " + dataBaseName + ".dbo.WordCount values ('" + word + " was found " + countWordAppearance + " times')";
        statement.execute(insertIntoSecondTable);
        System.out.println(word + " was found " + countWordAppearance + " times!");
        System.out.println("Below message is successfully inserted in another table!");
    }

    public void extractDBResultInAMap() throws SQLException {
        Map<String, List<Long>> map = new HashMap<String, List<Long>>();
        String sql = "select * from " + dataBaseName + ".dbo.WordList";
        preparedStatement = con.prepareStatement(sql);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            if (!map.containsKey(resultSet.getString("WORD"))) {
                map.put(resultSet.getString("WORD"), new ArrayList<Long>());
            }
            map.get(resultSet.getString("WORD")).add(resultSet.getLong("ID"));
        }

        for (Map.Entry<String, List<Long>> element : map.entrySet()) {
            System.out.println("Word " + element.getKey() + " was found " + countWordInTable(element.getKey()) + " times on lines: " + element.getValue());
        }
    }
}
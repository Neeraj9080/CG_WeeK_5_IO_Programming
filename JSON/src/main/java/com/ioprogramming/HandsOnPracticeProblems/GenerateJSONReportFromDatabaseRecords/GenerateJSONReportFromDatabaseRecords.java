package com.ioprogramming.HandsOnPracticeProblems.GenerateJSONReportFromDatabaseRecords;

import org.json.JSONArray;
import org.json.JSONObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
// Creating class GenerateJSONReportFromDatabaseRecords to generate report from database
public class GenerateJSONReportFromDatabaseRecords
{
    // Method to generate report
    public static void generateReport(String url,String user,String password,String query)
    {
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query))
        {
            // Creating JSON Array
            JSONArray jsonArray = new JSONArray();
            while (resultSet.next())
            {
                JSONObject obj = new JSONObject();
                obj.put("column1", resultSet.getString("column1"));
                obj.put("column2", resultSet.getString("column2"));
                obj.put("column3", resultSet.getString("column3"));
                // Add more columns as needed
                jsonArray.put(obj);
            }
            System.out.println(jsonArray.toString(4));

        } catch (Exception e)
        {
            System.out.println("Exception caught : " + e.getMessage());
        }
    }
    // Main method
    public static void main(String[] args)
    {
        String url = "jdbc:mysql://localhost:3789/user321";
        String user = "user321";
        String password = "user@321";
        String query = "SELECT * FROM USERRECORDS";

        // Calling method of the class
        generateReport(url,user, password,query);
    }
}

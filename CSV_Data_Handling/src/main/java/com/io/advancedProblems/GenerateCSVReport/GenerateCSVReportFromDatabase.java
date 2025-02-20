package com.io.advancedProblems.GenerateCSVReport;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
// Creating class GenerateCSVReportFromDatabase to generate CSV report from database
public class GenerateCSVReportFromDatabase
{
    // Method to fetch employee records and write to CSV
    public static void generateCSV(String dbUrl, String user, String password, String filePath) {
        // Handling SQLException
        try (Connection connection = DriverManager.getConnection(dbUrl, user, password);
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
             FileWriter writer = new FileWriter(filePath))
        {
            writer.write("EmployeeID,Name,Department,Salary\n");

            while (rs.next())
            {
                writer.write(rs.getInt("EmployeeID") + "," +
                        rs.getString("Name") + "," +
                        rs.getString("Department") + "," +
                        rs.getDouble("Salary") + "\n");
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception caught : " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args)
    {
        String dbUrl = "jdbc:mysql://localhost:3245/user321";
        String user = "user321";
        String password = "pass@321";
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\CSVFile.csv";
        generateCSV(dbUrl, user, password, filePath);
    }
}


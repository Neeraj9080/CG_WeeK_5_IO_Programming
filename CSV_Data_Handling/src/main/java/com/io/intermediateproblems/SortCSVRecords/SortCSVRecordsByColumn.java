package com.io.intermediateproblems.SortCSVRecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
// Creating class SortCSVRecordsByColumn to sort data of the employees
public class SortCSVRecordsByColumn
{
    // Method to sort records
    public static void sortRecords(String filePath)
    {
        List<String[]> employeeRecords = new ArrayList<>();
        // Handling IOException
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            boolean header = false;
            while ((line = bufferedReader.readLine()) != null)
            {
                if(!header)
                {
                    header = true;
                }
                else
                {
                    String[] records = line.trim().split(",");
                    employeeRecords.add(records);
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException caught : " + e.getMessage());
        }
        List<String[]> sortedEmployees = employeeRecords.stream().sorted(Comparator.comparingDouble(emp -> -Double.parseDouble(emp[3]))).toList();

        // Displaying the top 5 highest-paid employees
        System.out.println("Top 5 highest-paid employees : ");
        for (int i = 0; i < 5 && i < sortedEmployees.size(); i++)
        {
            System.out.println(String.join(",", sortedEmployees.get(i)));
        }
    }
    // Main method
    public static void main(String[] args)
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\CSVOutputFile.csv";
        // Calling method of the class
        sortRecords(filePath);
    }
}

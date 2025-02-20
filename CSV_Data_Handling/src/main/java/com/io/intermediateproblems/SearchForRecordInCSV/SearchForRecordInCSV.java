package com.io.intermediateproblems.SearchForRecordInCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// Creating class SearchForRecordInCSV to search records in CSV file using employee name
public class SearchForRecordInCSV
{
    // Method to search records
    public static void searchRecords(String filePath)
    {
        // Handling IOException
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            boolean header = false, flag = false;
            String employeeName;
            String searchName = "Abhishek";
            while ((line = bufferedReader.readLine()) != null)
            {
                String[] employeeRecords = line.split(",");
                if(!header)
                {
                    header = true;
                }
                else
                {
                    employeeName = employeeRecords[1];
                    // Check whether employee record is present or not
                    if((searchName).equals(employeeName.trim()))
                    {
                        flag = true;
                        System.out.println("Employee Found : " + searchName);
                        System.out.println("Employee Department : " + employeeRecords[2]);
                        System.out.println("Employee Salary : " + employeeRecords[3]);
                    }
                }
            }
            if(!flag)
            {
                System.out.println("Employee Record not found");
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException caught : " + e.getMessage());
        }
    }
    // Main method
    public static void main(String[] args)
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\CSVOutputFile.csv";
        // Calling method of the class
        searchRecords(filePath);
    }
}

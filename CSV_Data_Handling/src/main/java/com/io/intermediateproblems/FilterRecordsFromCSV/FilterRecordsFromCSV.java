package com.io.intermediateproblems.FilterRecordsFromCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// Creating class FilterRecordsFromCSV to filter records from a CSV file
public class FilterRecordsFromCSV
{
    // Method to filter records
    public static void filterRecords(String filePath)
    {
        // Handling IOException
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            boolean header = false;
            int mark;
            while ((line = bufferedReader.readLine()) != null)
            {
                String[] studentRecords = line.split(",");
                if(!header)
                {
                    header = true;
                    System.out.println(line);
                }
                else
                {
                    mark = Integer.parseInt(studentRecords[3]);
                    // Check whether student mark is greater than 80 or not
                    if(mark > 80)
                    {
                        System.out.println(line);
                    }
                }
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
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\CSVFile.csv";
        // Calling method of the class
        filterRecords(filePath);
    }
}

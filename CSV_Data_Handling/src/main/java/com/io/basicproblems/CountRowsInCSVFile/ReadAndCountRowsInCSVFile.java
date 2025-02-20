package com.io.basicproblems.CountRowsInCSVFile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// Creating class ReadAndCountRowsInCSVFile to count the number of records rows
public class ReadAndCountRowsInCSVFile
{
    // Method to count number of rows in CSV file
    public static int countRowsInCSVFile(String filePath)
    {
        int rowCount = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            boolean isHeader = true;
            while ((line = bufferedReader.readLine()) != null)
            {
                if (isHeader)
                {
                    isHeader = false;
                    continue;
                }
                rowCount++;
            }
        } catch (IOException e) {
            System.out.println("IOException caught : " + e.getMessage());
        }
        return rowCount;
    }
    // Main method
    public static void main(String[] args)
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\CSVFile.csv";
        System.out.println("Number of records excluding header row : " + countRowsInCSVFile(filePath));
    }
}
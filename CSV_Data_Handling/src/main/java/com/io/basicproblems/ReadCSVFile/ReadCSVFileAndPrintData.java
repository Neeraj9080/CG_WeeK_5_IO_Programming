package com.io.basicproblems.ReadCSVFile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// Creating class ReadCSVFileAndPrintData to read a CSV file and print data
public class ReadCSVFileAndPrintData
{
    // Method to read CSV file
    public static void readCSVFile(String filePath)
    {
        // Handling IOException
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                String[] columns = line.split(",");
                System.out.println( columns[0] +" " + columns[1] + " " + columns[2] + " " + columns[3]);
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException Caught: " + e.getMessage());
        }
    }
    // Main method
    public static void main(String[] args)
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\CSVFile.csv";
        // Calling method of the class
        readCSVFile(filePath);
    }
}

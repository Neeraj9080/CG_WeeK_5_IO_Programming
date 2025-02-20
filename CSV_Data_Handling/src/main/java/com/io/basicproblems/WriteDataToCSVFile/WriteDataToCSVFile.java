package com.io.basicproblems.WriteDataToCSVFile;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
// Creating class WriteDataToCSVFile to write data in csv file
public class WriteDataToCSVFile
{
    // Method to write in CSV file
    public static void writeInCSVFile(String filePath)
    {
        // Handling IOException
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath)))
        {
            bufferedWriter.write("ID, Name, Department, Salary\n");
            bufferedWriter.write("101, Rajan, HR, 62000\n");
            bufferedWriter.write("102, Abhishek, IT, 58000\n");
            bufferedWriter.write("103, Veer, Developer, 75000\n");
            bufferedWriter.write("104, Arpit, Manager, 80000\n");
            bufferedWriter.write("105, Anuj, Hacker, 65000\n");
            System.out.println("CSV file written successfully!");
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
        writeInCSVFile(filePath);
    }
}

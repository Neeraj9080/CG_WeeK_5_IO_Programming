package com.io.advancedProblems.ReadLargeCSVFile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// Creating class ReadLargeCSVFileEfficiently to read large CSV file efficiently
public class ReadLargeCSVFileEfficiently
{
    // Method to read CSV file in chunks
    public static void readCSVInChunks(String filePath, int chunkSize)
    {
        // Handling IOException
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            boolean header = true;
            int count = 0;

            while ((line = br.readLine()) != null)
            {
                if (header)
                {
                    header = false;
                    continue;
                }

                System.out.println(line);
                count++;

                if (count % chunkSize == 0)
                {
                    System.out.println("Processed " + count + " records so far...");
                }
            }
            System.out.println("Total records processed : " + count);
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
        int chunkSize = 100;
        readCSVInChunks(filePath, chunkSize);
    }
}




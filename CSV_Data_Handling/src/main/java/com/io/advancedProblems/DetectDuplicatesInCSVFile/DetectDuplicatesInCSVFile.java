package com.io.advancedProblems.DetectDuplicatesInCSVFile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
// Creating class DetectDuplicatesInCSVFile to detect duplicates records in CSV file
public class DetectDuplicatesInCSVFile
{
    // Method to detect duplicates
    public static void detectDuplicates(String filePath)
    {
        Set<Integer> uniqueIds = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        // Handling IOException
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            boolean header = true;

            while ((line = br.readLine()) != null)
            {
                if (header) {
                    header = false;
                    continue;
                }
                String[] fields = line.split(",");
                int id = Integer.parseInt(fields[0]);

                if (!uniqueIds.add(id)) {
                    duplicates.add(line);
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException caught : " + e.getMessage());
        }

        // Printing duplicate records
        if (!duplicates.isEmpty())
        {
            System.out.println("Duplicate records found:");
            for (String record : duplicates)
            {
                System.out.println(record);
            }
        }
        else
        {
            System.out.println("No duplicate records found.");
        }
    }

    // Main method
    public static void main(String[] args)
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\DuplicateCSVData.csv";
        // Calling methods of the class
        detectDuplicates(filePath);
    }
}
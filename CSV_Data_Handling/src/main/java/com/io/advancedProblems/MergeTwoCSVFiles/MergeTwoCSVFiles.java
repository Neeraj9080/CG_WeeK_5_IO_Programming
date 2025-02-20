package com.io.advancedProblems.MergeTwoCSVFiles;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
// Creating class MergeTwoCSVFiles to merge two csv file
public class MergeTwoCSVFiles
{
    // Method to read CSV into a Map
    public static Map<Integer, String[]> readCSVData(String filePath)
    {
        Map<Integer, String[]> data = new HashMap<>();

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
                data.put(id, fields);
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException caught : " + e.getMessage());
        }
        return data;
    }

    // Main method
    public static void main(String[] args)
    {
        String file1Path = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\Student1.csv";
        String file2Path = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\Student2.csv";
        String outputPath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\Merged_Student.csv";

        Map<Integer, String[]> data1 = readCSVData(file1Path);
        Map<Integer, String[]> data2 = readCSVData(file2Path);

        // Handling IOException
        try (FileWriter writer = new FileWriter(outputPath))
        {
            writer.write("ID,Name,Age,Marks,Grade\n");

            for (Map.Entry<Integer, String[]> entry : data1.entrySet())
            {
                int id = entry.getKey();
                String[] fields1 = entry.getValue();
                String[] fields2 = data2.get(id);

                if (fields2 != null) {
                    writer.write(id + "," + fields1[1] + "," + fields1[2] + "," + fields2[1] + "," + fields2[2] + "\n");
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException caught : " + e.getMessage());
        }
    }
}

package com.ioprogramming.HandsOnPracticeProblems.ConvertCSVDataIntoJSON;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.FileReader;
// Creating class ConvertCSVDataIntoJSON to convert csv file into json file
public class ConvertCSVDataIntoJSON
{
    // Method to convert csv file into json file
    public static void convertCSVIntoJSON(String csvFilePath)
    {
        try(FileReader fileReader = new FileReader(csvFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader))
        {
            JSONArray jsonArray = new JSONArray();
            String[] header = bufferedReader.readLine().split(",");
            String line;
            // Read the Line from the file
            while((line = bufferedReader.readLine()) != null)
            {
                String[] values = line.split(",");
                // Creating JSONObject
                JSONObject obj = new JSONObject();

                for(int i=0;i<header.length;i++)
                {
                    obj.put(header[i],values[i]);
                }
                jsonArray.put(obj);
            }
            System.out.println(jsonArray.toString(4));
        }
        catch(Exception e)
        {
            System.out.println("Exception caught : " + e.getMessage());
        }

    }
    // Main method
    public static void main(String[] args)
    {
        String csvFilePath ="D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_02_JSON\\JSONFiles\\CSVFile.csv";
        // Method calling of the class
        convertCSVIntoJSON(csvFilePath);
    }
}

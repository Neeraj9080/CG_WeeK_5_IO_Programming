package com.io.advancedProblems.TestConvertJSONToCSV;

import org.junit.jupiter.api.Test;
import static com.io.advancedProblems.ConvertJSONToCSV.ConvertJSONToCSVAndViceVersa.csvToJSON;
import static com.io.advancedProblems.ConvertJSONToCSV.ConvertJSONToCSVAndViceVersa.jsonToCSV;
// Creating class TestConvertJSONToCSVAndViceVersa to test our ConvertJSONToCSVAndViceVersa program
public class TestConvertJSONToCSVAndViceVersa
{
    @Test
    void testJSONToCSV()
    {
        String jsonFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\JSON.json";
        String csvFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\JSONToCSV.csv";

        // Converting JSON to CSV
        jsonToCSV(jsonFilePath, csvFilePath);
    }

    @Test
    void testCSVToJSON()
    {
        String csvFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\JSONToCSV.csv";
        String outputJsonFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\ConvertedJCSVToJSON.csv";

        // Converting JSON to CSV
        csvToJSON(csvFilePath, outputJsonFilePath);
    }
}

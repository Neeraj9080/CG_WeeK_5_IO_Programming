package com.ioprogramming.HandsOnPracticeProblems.TestConvertCSVDataIntoJSON;

import org.junit.jupiter.api.Test;
import static com.ioprogramming.HandsOnPracticeProblems.ConvertCSVDataIntoJSON.ConvertCSVDataIntoJSON.convertCSVIntoJSON;
// Creating class TestConvertCSVDataIntoJSON to test our ConvertCSVDataIntoJSON program
public class TestConvertCSVDataIntoJSON
{
    @Test
    void testConvertCSVIntoJSON()
    {
        String csvFilePath ="D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_02_JSON\\JSONFiles\\CSVFile.csv";
        // Method calling of the class
        convertCSVIntoJSON(csvFilePath);
    }
}

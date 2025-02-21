package com.ioprogramming.PracticeProblems.TestParseJSONAndFilterRecords;

import org.junit.jupiter.api.Test;
import static com.ioprogramming.PracticeProblems.ParseJSONAndFilterRecords.ParseJSONandFilterRecords.filterRecords;
// Creating class TestParseJSONandFilterRecords to test our ParseJSONandFilterRecords program
public class TestParseJSONandFilterRecords
{
    @Test
    void testFilterRecords()
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_02_JSON\\JSONFiles\\ExtractSpecificField.json";
        // Calling method of the class
        filterRecords(filePath);
    }
}

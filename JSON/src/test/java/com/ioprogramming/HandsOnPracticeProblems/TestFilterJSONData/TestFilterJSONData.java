package com.ioprogramming.HandsOnPracticeProblems.TestFilterJSONData;

import org.junit.jupiter.api.Test;
import static com.ioprogramming.PracticeProblems.ParseJSONAndFilterRecords.ParseJSONandFilterRecords.filterRecords;
// Creating class TestFilterJSONData to test our FilterJSONData program
public class TestFilterJSONData
{
    @Test
    void testFilterRecords()
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_02_JSON\\JSONFiles\\user.json";
        // Calling method of the class
        filterRecords(filePath);
    }
}

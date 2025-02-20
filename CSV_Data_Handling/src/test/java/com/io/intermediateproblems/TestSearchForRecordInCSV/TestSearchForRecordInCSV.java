package com.io.intermediateproblems.TestSearchForRecordInCSV;

import org.junit.jupiter.api.Test;
import static com.io.intermediateproblems.SearchForRecordInCSV.SearchForRecordInCSV.searchRecords;
// Creating class TestSearchForRecordInCSV to test our SearchForRecordInCSV program
public class TestSearchForRecordInCSV
{
    @Test
    void testSearchRecords()
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\CSVOutputFile.csv";
        // Calling method of the class
        searchRecords(filePath);
    }
}

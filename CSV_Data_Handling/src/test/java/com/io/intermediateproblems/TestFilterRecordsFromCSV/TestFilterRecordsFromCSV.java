package com.io.intermediateproblems.TestFilterRecordsFromCSV;
import org.junit.jupiter.api.Test;
import static com.io.intermediateproblems.FilterRecordsFromCSV.FilterRecordsFromCSV.filterRecords;

// Creating class TestFilterRecordsFromCSV to test our FilterRecordsFromCSV program
public class TestFilterRecordsFromCSV
{
    @Test
    void testFilterRecords()
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\CSVFile.csv";
        // Calling method of the class
        filterRecords(filePath);
    }
}

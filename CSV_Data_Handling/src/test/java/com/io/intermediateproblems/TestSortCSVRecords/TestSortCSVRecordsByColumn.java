package com.io.intermediateproblems.TestSortCSVRecords;

import org.junit.jupiter.api.Test;
import static com.io.intermediateproblems.SortCSVRecords.SortCSVRecordsByColumn.sortRecords;
// Creating class TestSortCSVRecordsByColumn to test our SortCSVRecordsByColumn program
public class TestSortCSVRecordsByColumn
{
    @Test
    void testSearchRecords()
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\CSVOutputFile.csv";
        // Calling method of the class
        sortRecords(filePath);
    }
}

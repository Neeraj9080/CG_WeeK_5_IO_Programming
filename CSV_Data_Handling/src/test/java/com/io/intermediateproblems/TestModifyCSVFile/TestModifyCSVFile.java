package com.io.intermediateproblems.TestModifyCSVFile;

import org.junit.jupiter.api.Test;
import static com.io.intermediateproblems.ModifyCSVFile.ModifyCSVFile.modifyRecords;
// Creating class TestModifyCSVFile to test our ModifyCSVFile program
public class TestModifyCSVFile
{
    @Test
    void testModifyRecords()
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\CSVOutputFile.csv";
        // Calling method of the class
        modifyRecords(filePath);
    }
}

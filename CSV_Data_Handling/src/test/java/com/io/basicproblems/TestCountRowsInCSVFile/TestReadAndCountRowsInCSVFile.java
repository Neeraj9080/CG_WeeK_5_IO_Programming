package com.io.basicproblems.TestCountRowsInCSVFile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.io.basicproblems.CountRowsInCSVFile.ReadAndCountRowsInCSVFile.countRowsInCSVFile;

// Creating class TestReadAndCountRowsInCSVFile to test our ReadAndCountRowsInCSVFile program
public class TestReadAndCountRowsInCSVFile
{
    @Test
    void testCountRowsInCSVFile()
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\CSVFile.csv";
        Assertions.assertEquals(3, countRowsInCSVFile(filePath));
    }
}

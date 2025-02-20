package com.io.advancedProblems.TestReadLargeCSVFile;

import org.junit.jupiter.api.Test;
import static com.io.advancedProblems.ReadLargeCSVFile.ReadLargeCSVFileEfficiently.readCSVInChunks;
// Creating class TestTestReadLargeCSVFileEfficiently to test our TestReadLargeCSVFileEfficiently program
public class TestReadLargeCSVFileEfficiently
{
    @Test
    void testReadCSVInChunks()
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\CSVOutputFile.csv";
        int chunkSize = 100;
        readCSVInChunks(filePath, chunkSize);
    }
}

package com.io.basicproblems.TestReadCSVFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.io.basicproblems.ReadCSVFile.ReadCSVFileAndPrintData.readCSVFile;
// Creating class TestReadCSVFileAndPrintData to test our ReadCSVFileAndPrintData program
public class TestReadCSVFileAndPrintData
{
    @Test
    void testReadCSVFile()
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\CSVFile.csv";
        // Calling method of the class
        readCSVFile(filePath);
        Assertions.assertTrue(true); // to ensure our method is called properly
    }
}

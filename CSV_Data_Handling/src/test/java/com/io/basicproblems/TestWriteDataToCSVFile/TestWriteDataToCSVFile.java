package com.io.basicproblems.TestWriteDataToCSVFile;
import org.junit.jupiter.api.Test;
import static com.io.basicproblems.WriteDataToCSVFile.WriteDataToCSVFile.writeInCSVFile;

// Creating class TestWriteDataToCSVFile to test our WriteDataToCSVFile program
public class TestWriteDataToCSVFile
{
    @Test
    void testWriteInCSVFile()
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\CSVOutputFile.csv";
        // Calling method of the class
        writeInCSVFile(filePath);
    }
}

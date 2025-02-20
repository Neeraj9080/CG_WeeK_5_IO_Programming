package com.io.advancedProblems.TestDetectDuplicatesInCSVFile;

import org.junit.jupiter.api.Test;
import static com.io.advancedProblems.DetectDuplicatesInCSVFile.DetectDuplicatesInCSVFile.detectDuplicates;
// Creating class TestDetectDuplicatesInCSVFile to test our DetectDuplicatesInCSVFile program
public class TestDetectDuplicatesInCSVFile
{
    @Test
    void TestDetectDuplicates()
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\DuplicateCSVData.csv";
        detectDuplicates(filePath);
    }
}

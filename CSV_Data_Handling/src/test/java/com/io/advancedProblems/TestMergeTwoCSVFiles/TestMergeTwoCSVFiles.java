package com.io.advancedProblems.TestMergeTwoCSVFiles;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static com.io.advancedProblems.MergeTwoCSVFiles.MergeTwoCSVFiles.readCSVData;
// Creating class TestTestMergeTwoCSVFiles to test our TestMergeTwoCSVFiles program
public class TestMergeTwoCSVFiles
{
    @Test
    void testReadCSV()
    {
        String file1Path = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\Student1.csv";
        String file2Path = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\Student2.csv";
        String outputPath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\Merged_Student.csv";

        Map<Integer, String[]> data1 = readCSVData(file1Path);
        Map<Integer, String[]> data2 = readCSVData(file2Path);
    }
}

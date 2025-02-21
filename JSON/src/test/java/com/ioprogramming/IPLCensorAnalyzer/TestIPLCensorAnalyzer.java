package com.ioprogramming.IPLCensorAnalyzer;

import org.junit.jupiter.api.Test;
import static com.ioprogramming.IPLCensorAnalyzer.IPLCensorAnalyzer.readAndProcessCSVData;
import static com.ioprogramming.IPLCensorAnalyzer.IPLCensorAnalyzer.readAndProcessJSONData;
// Creating class TestIPLCensorAnalyzer to test our IPLCensorAnalyzer program
public class TestIPLCensorAnalyzer
{
    @Test
    void testReadAndProcessJSONData()
    {
        String jsonInputFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_02_JSON\\JSONFiles\\JSONInputFile.json";
        String censoredJSONFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_02_JSON\\JSONFiles\\CensoredJSONFile.json";

        // Calling method of the class
        readAndProcessJSONData(jsonInputFilePath, censoredJSONFilePath);
    }

    @Test
    void testReadAndProcessCSVData()
    {
        String csvInputFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_02_JSON\\JSONFiles\\CSVInputFile.csv";
        String censoredCSVFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_02_JSON\\JSONFiles\\CensoredCSVFile.csv";

        // Calling method of the class
        readAndProcessCSVData(csvInputFilePath, censoredCSVFilePath);
    }
}

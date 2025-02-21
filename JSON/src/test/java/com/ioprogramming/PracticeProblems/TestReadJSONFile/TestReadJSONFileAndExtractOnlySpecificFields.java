package com.ioprogramming.PracticeProblems.TestReadJSONFile;

import org.junit.jupiter.api.Test;
import static com.ioprogramming.PracticeProblems.ReadJSONFile.ReadJSONFileAndExtractOnlySpecificFields.readFile;
// Creating class TestReadJSONFileAndExtractOnlySpecificFields to test our ReadJSONFileAndExtractOnlySpecificFields program
public class TestReadJSONFileAndExtractOnlySpecificFields
{
    @Test
    void testReadJSONFile()
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_02_JSON\\JSONFiles\\ExtractSpecificField.json";
        // Calling the method of the class
        readFile(filePath);
    }
}

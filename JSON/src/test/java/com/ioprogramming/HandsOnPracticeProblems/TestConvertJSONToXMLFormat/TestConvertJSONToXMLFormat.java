package com.ioprogramming.HandsOnPracticeProblems.TestConvertJSONToXMLFormat;

import org.junit.jupiter.api.Test;
import static com.ioprogramming.HandsOnPracticeProblems.ConvertJSONToXMLFormat.ConvertJSONToXMLFormat.convertJSONIntoXML;
// Creating class TestConvertJSONToXMLFormat to test our ConvertJSONToXMLFormat program
public class TestConvertJSONToXMLFormat
{
    @Test
    void testConvertJSONIntoXML()
    {
        String filePath ="D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_02_JSON\\JSONFiles\\JSONFile.json";
        // Calling method of the class
        convertJSONIntoXML(filePath);
    }
}

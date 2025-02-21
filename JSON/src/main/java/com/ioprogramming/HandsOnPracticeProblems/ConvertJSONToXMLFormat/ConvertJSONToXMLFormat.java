package com.ioprogramming.HandsOnPracticeProblems.ConvertJSONToXMLFormat;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.XML;
import java.io.FileReader;
import java.io.IOException;

// Creating class ConvertJSONToXMLFormat to convert JSON file into XML file
public class ConvertJSONToXMLFormat
{
    // Method to convert JSON file into xml file
    public static void convertJSONIntoXML(String filePath)
    {
        try
        {
            FileReader reader = new FileReader(filePath);
            JSONObject jsonObject = new JSONObject(new JSONTokener(reader));

            // Convert JSON file into XML file
            String xml = XML.toString(jsonObject);
            // Display the XML file
            System.out.println(xml);
        }
        catch (IOException e)
        {
            System.out.println("IOException caught : " + e.getMessage());
        }
    }
    // main method
    public static void main(String[] args)
    {
        String filePath ="D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_02_JSON\\JSONFiles\\JSONFile.json";
        // Calling method of the class
        convertJSONIntoXML(filePath);
    }
}



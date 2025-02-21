package com.ioprogramming.PracticeProblems.ReadJSONFile;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
// Creating class ReadJSONFileAndExtractOnlySpecificFields to extract specific field from json file
public class ReadJSONFileAndExtractOnlySpecificFields
{
    // Method to read JSON file
    public static void readFile(String filePath)
    {
        // Handling IOException
        try
        {
           ObjectMapper objectMapper = new ObjectMapper();
           JsonNode jsonNode = objectMapper.readTree(new File(filePath));

           for(JsonNode node : jsonNode)
           {
               String name = node.get("name").asText();
               String email = node.get("email").asText();

               // Printing Name and Email from JSON file
               System.out.println("Name : " + name);
               System.out.println("Email : " + email);
           }
        }
        catch(IOException e)
        {
            System.out.println("IOException caught : " + e.getMessage());
        }
    }
    // Main method
    public static void main(String[] args)
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_02_JSON\\JSONFiles\\ExtractSpecificField.json";
        // Calling the method of the class
        readFile(filePath);
    }
}

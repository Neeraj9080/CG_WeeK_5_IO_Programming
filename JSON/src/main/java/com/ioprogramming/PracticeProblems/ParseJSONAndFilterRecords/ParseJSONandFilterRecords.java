package com.ioprogramming.PracticeProblems.ParseJSONAndFilterRecords;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
// Creating class ParseJSONandFilterRecords to filter records
public class ParseJSONandFilterRecords
{
    // Method to filter records
    public static void filterRecords(String filePath)
    {
        // Handling IOException
        try
        {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File(filePath));

            for(JsonNode node : jsonNode)
            {
                int age = node.get("age").asInt();

                if(age > 25)
                {
                    System.out.println(node);
                }
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
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_02_JSON\\JSONFiles\\user.json";
        // Calling method of the class
        filterRecords(filePath);
    }
}

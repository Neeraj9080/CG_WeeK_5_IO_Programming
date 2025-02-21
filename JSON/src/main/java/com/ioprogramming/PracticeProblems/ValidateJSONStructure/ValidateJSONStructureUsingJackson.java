package com.ioprogramming.PracticeProblems.ValidateJSONStructure;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
// Creating class  ValidateJSONStructureUsingJackson
public class ValidateJSONStructureUsingJackson
{
    // Method to validate json structure
    public static boolean isValidJson(String json)
    {
        // Handling Exception
        try
        {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode node = mapper.readTree(json);
            return true;
        }
        catch (JsonProcessingException e)
        {
            return false;
        }
    }

    // Main method
    public static void main(String[] args)
    {
        String json = "{\"name\":\"Rajan\", \"age\":22}";
        // Calling the method of the class
        System.out.println(isValidJson(json) ? "JSON structure is valid" : "JSON structure is not valid");
    }
}


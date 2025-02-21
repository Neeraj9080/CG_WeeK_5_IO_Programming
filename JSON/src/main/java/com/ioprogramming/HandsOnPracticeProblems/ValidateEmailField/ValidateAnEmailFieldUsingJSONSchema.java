package com.ioprogramming.HandsOnPracticeProblems.ValidateEmailField;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Creating class ValidateAnEmailFieldUsingJSONSchema to validate an email field in JSON file
public class ValidateAnEmailFieldUsingJSONSchema
{
    // Method to validate email field
    public static void validateEmail(String filePath)
    {
        // Handling IOException
        try
        {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File(filePath));
            String regexForEmail = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";
            Pattern pattern = Pattern.compile(regexForEmail);
            for(JsonNode node : jsonNode)
            {
                String email = node.get("email").asText();
                Matcher matcher = pattern.matcher(email);
                // Printing valid Email from JSON file
                if (matcher.matches())
                {
                    System.out.println("Email : " + email + " is valid ");
                }
                else
                {
                    System.out.println("Email : " + email + " is Invalidvalid ");
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
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_02_JSON\\JSONFiles\\ExtractSpecificField.json";
        // Calling the method of the class
        validateEmail(filePath);
    }
}


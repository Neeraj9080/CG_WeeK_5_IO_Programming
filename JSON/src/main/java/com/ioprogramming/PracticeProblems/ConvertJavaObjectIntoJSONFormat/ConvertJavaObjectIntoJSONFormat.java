package com.ioprogramming.PracticeProblems.ConvertJavaObjectIntoJSONFormat;

import com.fasterxml.jackson.databind.ObjectMapper;
// Creating class ConvertJavaObjectIntoJSONFormat to convert Java object into JSON format
public class ConvertJavaObjectIntoJSONFormat
{
    // Main method
    public static void main(String[] args)
    {
        // Handling Exception
        try
        {
            ObjectMapper objectMapper = new ObjectMapper();
            Car car = new Car("Bolero", "SUV" , 4);

            // Converting Java Object to JSON String
            String jsonString = objectMapper.writeValueAsString(car);
            System.out.println(jsonString);
        }
        catch (Exception e)
        {
            System.out.println("Exception caught : " + e.getMessage());
        }
    }
}

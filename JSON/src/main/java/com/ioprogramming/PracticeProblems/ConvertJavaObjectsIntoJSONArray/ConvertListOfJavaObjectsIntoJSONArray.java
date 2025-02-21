package com.ioprogramming.PracticeProblems.ConvertJavaObjectsIntoJSONArray;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
// Creating class ConvertListOfAJavaObjectsIntoJSONArray to convert list of java object into JSON array
public class ConvertListOfJavaObjectsIntoJSONArray
{
    // Main method
    public static void main(String[] args)
    {
        // Create a list of Student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student("Abhishek", 30));
        students.add(new Student("Rajan", 25));

        // Create an ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        try
        {
            // Convert the list to a JSON array
            String jsonArray = objectMapper.writeValueAsString(students);

            // Print the JSON array
            System.out.println(jsonArray);
        }
        catch (JsonProcessingException e)
        {
            System.out.println("Exception caught : " + e.getMessage());
        }
    }
}

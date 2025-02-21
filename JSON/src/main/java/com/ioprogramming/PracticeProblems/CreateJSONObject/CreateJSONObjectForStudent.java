package com.ioprogramming.PracticeProblems.CreateJSONObject;

import org.json.JSONArray;
import org.json.JSONObject;
// Creating class CreateJSONObjectForStudent to create json object for a student
public class CreateJSONObjectForStudent
{
    // Main method
    public static void main(String[] args)
    {
        // Creating JSONArray
        JSONArray subjects = new JSONArray();
        subjects.put("Physics");
        subjects.put("Chemistry");
        subjects.put("Mathematics");

        // Creating JSON Object
        JSONObject student = new JSONObject();
        student.put("name" , "Rajan");
        student.put("age" , 25);
        student.put("subjects" , subjects);

        System.out.println(student.toString(4));
    }
}

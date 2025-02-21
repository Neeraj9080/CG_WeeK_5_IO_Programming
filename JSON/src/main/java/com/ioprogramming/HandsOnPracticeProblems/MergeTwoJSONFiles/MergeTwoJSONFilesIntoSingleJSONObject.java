package com.ioprogramming.HandsOnPracticeProblems.MergeTwoJSONFiles;

import org.json.JSONObject;
// Creating class MergeTwoJSONFilesIntoSingleJSONObject to merge two JSON files into one
public class MergeTwoJSONFilesIntoSingleJSONObject
{
    // Method to merge JSON objects
    public static void mergingJSONObjects(JSONObject jsonObject1, JSONObject jsonObject2)
    {
        for (String key : jsonObject2.keySet())
        {
            jsonObject1.put(key , jsonObject2.get(key));
        }
        System.out.println(jsonObject1.toString(4));
    }

    // Main method
    public static void main(String[] args)
    {
        // Creating JSON objects
        JSONObject jsonObject1 = new JSONObject();
        JSONObject jsonObject2 = new JSONObject();

        // Adding data into jsonObject1
        jsonObject1.put("name", "Rajan");
        jsonObject1.put("age", 21);

        // Adding data into jsonObject2
        jsonObject2.put("gender", "Male");
        jsonObject2.put("city", "Bhopal");

        // Calling method of the class
        mergingJSONObjects(jsonObject1, jsonObject2);
    }
}

package com.ioprogramming.PracticeProblems.MergeTwoJSONObjects;

import org.json.JSONObject;
// Creating class MergeTwoJSONObjectsIntoOne to merge two JSON objects into one
public class MergeTwoJSONObjectsIntoOne
{
    // Method to merge JSON objects
    public static void mergeJSONObjects(JSONObject jsonObject1, JSONObject jsonObject2)
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
        mergeJSONObjects(jsonObject1, jsonObject2);
    }
}


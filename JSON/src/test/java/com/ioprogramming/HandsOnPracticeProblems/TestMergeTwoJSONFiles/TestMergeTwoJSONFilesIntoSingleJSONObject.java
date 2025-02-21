package com.ioprogramming.HandsOnPracticeProblems.TestMergeTwoJSONFiles;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import static com.ioprogramming.HandsOnPracticeProblems.MergeTwoJSONFiles.MergeTwoJSONFilesIntoSingleJSONObject.mergingJSONObjects;

// Creating class TestMergeTwoJSONFilesIntoSingleJSONObject to test our MergeTwoJSONFilesIntoSingleJSONObject program
public class TestMergeTwoJSONFilesIntoSingleJSONObject
{
    @Test
    void testMergeJSONObjects()
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

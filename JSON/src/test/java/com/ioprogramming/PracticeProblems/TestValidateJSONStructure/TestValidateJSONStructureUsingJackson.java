package com.ioprogramming.PracticeProblems.TestValidateJSONStructure;

import org.junit.jupiter.api.Test;
import static com.ioprogramming.PracticeProblems.ValidateJSONStructure.ValidateJSONStructureUsingJackson.isValidJson;
// Creating class TestValidateJSONStructureUsingJackson to test our ValidateJSONStructureUsingJackson program
public class TestValidateJSONStructureUsingJackson
{
    @Test
    void testISValidJSON()
    {
        String json = "{\"name\":\"Rajan\", \"age\":22}";
        // Calling the method of the class
        System.out.println(isValidJson(json) ? "JSON structure is valid" : "JSON structure is not valid");
    }
}

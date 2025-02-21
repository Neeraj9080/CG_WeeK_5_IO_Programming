package com.ioprogramming.HandsOnPracticeProblems.TestValidateEmailField;

import org.junit.jupiter.api.Test;
import static com.ioprogramming.HandsOnPracticeProblems.ValidateEmailField.ValidateAnEmailFieldUsingJSONSchema.validateEmail;
// Creating class TestValidateAnEmailFieldUsingJSONSchema to test our ValidateAnEmailFieldUsingJSONSchema program
public class TestValidateAnEmailFieldUsingJSONSchema
{
    @Test
    void testValidateAnEmailFieldUsingJSONSchema()
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_02_JSON\\JSONFiles\\ExtractSpecificField.json";
        // Calling the method of the class
        validateEmail(filePath);
    }
}

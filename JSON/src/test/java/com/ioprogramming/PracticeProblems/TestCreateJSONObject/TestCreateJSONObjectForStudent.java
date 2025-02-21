package com.ioprogramming.PracticeProblems.TestCreateJSONObject;

import com.ioprogramming.PracticeProblems.CreateJSONObject.CreateJSONObjectForStudent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// Creating class TestCreateJSONObjectForStudent to test our CreateJSONObjectForStudent program
public class TestCreateJSONObjectForStudent
{
    @Test
    void testCreateJSONObjectForStudent()
    {
        CreateJSONObjectForStudent.main(new String[]{});
        Assertions.assertTrue(true);
    }
}

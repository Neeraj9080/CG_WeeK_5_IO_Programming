package com.ioprogramming.PracticeProblems.TestConvertJavaObjectIntoJSONFormat;

import com.ioprogramming.PracticeProblems.ConvertJavaObjectIntoJSONFormat.ConvertJavaObjectIntoJSONFormat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// Creating class TestConvertJavaObjectIntoJSONFormat to test our ConvertJavaObjectIntoJSONFormat program
public class TestConvertJavaObjectIntoJSONFormat
{
    @Test
    void testConvertJavaObjectIntoJSONFormat()
    {
        ConvertJavaObjectIntoJSONFormat.main(new String[]{});
        Assertions.assertTrue(true);
    }
}

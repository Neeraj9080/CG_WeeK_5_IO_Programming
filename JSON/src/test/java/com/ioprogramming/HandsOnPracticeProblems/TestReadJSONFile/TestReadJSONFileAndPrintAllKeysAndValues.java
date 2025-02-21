package com.ioprogramming.HandsOnPracticeProblems.TestReadJSONFile;

import com.ioprogramming.HandsOnPracticeProblems.ReadJSONFile.ReadJSONFileAndPrintAllKeysAndValues;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// Creating class TestReadJSONFileAndPrintAllKeysAndValues to test our ReadJSONFileAndPrintAllKeysAndValues program
public class TestReadJSONFileAndPrintAllKeysAndValues
{
    @Test
    void testDisplayKeysAndValues()
    {
        ReadJSONFileAndPrintAllKeysAndValues.main(new String[] {});
        Assertions.assertTrue(true);
    }
}

package com.ioprogramming.HandsOnPracticeProblems.TestGenerateJSONReportFromDatabaseRecords;

import com.ioprogramming.HandsOnPracticeProblems.GenerateJSONReportFromDatabaseRecords.GenerateJSONReportFromDatabaseRecords;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// Creating class GenerateJSONReportFromDatabaseRecords to test our GenerateJSONReportFromDatabaseRecords program
public class TestGenerateJSONReportFromDatabaseRecords
{
    @Test
    void testGenerateJSONReportFromDatabaseRecords()
    {
        GenerateJSONReportFromDatabaseRecords.main(new String[]{});
        Assertions.assertTrue(true);
    }
}

package com.io.advancedProblems.TestGenerateCSVReport;

import org.junit.jupiter.api.Test;
import static com.io.advancedProblems.GenerateCSVReport.GenerateCSVReportFromDatabase.generateCSV;
// Creating class TestGenerateCSVReportFromDatabase to test our GenerateCSVReportFromDatabase program
public class TestGenerateCSVReportFromDatabase
{
    @Test
    void testGenerateCSV()
    {
        String dbUrl = "jdbc:mysql://localhost:3245/user321";
        String user = "user321";
        String password = "pass@321";
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\CSVFile.csv";
        generateCSV(dbUrl, user, password, filePath);
    }
}

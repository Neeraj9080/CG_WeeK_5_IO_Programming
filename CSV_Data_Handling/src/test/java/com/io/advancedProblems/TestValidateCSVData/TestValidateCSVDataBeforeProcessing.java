package com.io.advancedProblems.ValidateCSVData;

import org.junit.jupiter.api.Test;
import static com.io.advancedProblems.ValidateCSVData.ValidateCSVDataBeforeProcessing.validateCSVData;
// Creating class TestValidateCSVDataBeforeProcessing to test our ValidateCSVDataBeforeProcessing program
public class TestValidateCSVDataBeforeProcessing
{
    @Test
    void testValidateCSVData()
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\ValidateCSVData.csv";
        String regexForEmail = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String regexForPhoneNumbers = "\\d{10}";
        // Calling method of the class
        validateCSVData(filePath, regexForEmail, regexForPhoneNumbers);
    }
}

package com.io.advancedProblems.ValidateCSVData;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
// Creating class ValidateCSVDataBeforeProcessing to validate CSV data before processing
public class ValidateCSVDataBeforeProcessing
{
    // Method to validate CSV Data
    public static void validateCSVData(String filePath, String regexForEmail, String regexForPhoneNumber)
    {
        // Handling IOException
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {
            Pattern emailPattern = Pattern.compile(regexForEmail);
            Pattern phonePattern = Pattern.compile(regexForPhoneNumber);
            String line;
            boolean header = true;
            while ((line = br.readLine()) != null)
            {
                if (header)
                {
                    header = false;
                    continue;
                }
                String[] fields = line.split(",");
                String email = fields[1];
                String phone = fields[2];

                if (!emailPattern.matcher(email).matches())
                {
                    System.out.println("Invalid email: " + line);
                }
                else if (!phonePattern.matcher(phone).matches())
                {
                    System.out.println("Invalid phone number: " + line);
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException caught : " + e.getMessage());
        }
    }
    // Main method
    public static void main(String[] args)
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\ValidateCSVData.csv";
        String regexForEmail = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String regexForPhoneNumbers = "\\d{10}";
        // Calling method of the class
        validateCSVData(filePath, regexForEmail, regexForPhoneNumbers);
    }
}


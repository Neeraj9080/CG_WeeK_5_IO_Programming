
package com.io.intermediateproblems.ModifyCSVFile;

import java.io.*;
// Creating class ModifyCSVFile to update salary of the IT department employee
public class ModifyCSVFile
{
    // Method to modify records
    public static void modifyRecords(String filePath)
    {
        // Handling IOException
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            boolean header = false;
            while ((line = bufferedReader.readLine()) != null)
            {
                String[] employeeRecords = line.split(",");
                if(!header)
                {
                    header = true;
                }
                else
                {
                    // Check whether employee record is present or not
                    if("IT".equals(employeeRecords[2].trim()))
                    {
                        double salary = Double.parseDouble(employeeRecords[3]) * 0.1;
                        employeeRecords[3] = String.valueOf(salary);
                        System.out.println("Salary of IT Department updated successfully!");
                    }
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
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\CSVOutputFile.csv";
        // Calling method of the class
        modifyRecords(filePath);
    }
}

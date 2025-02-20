package com.io.advancedProblems.TestConvertCSVDataIntoJavaObjects;

import com.io.advancedProblems.ConvertCSVDataIntoJavaObjects.Student;
import org.junit.jupiter.api.Test;
import java.util.List;
import static com.io.advancedProblems.ConvertCSVDataIntoJavaObjects.ConvertCSVDataIntoJavaObjects.readCSV;
// Creating class TestConvertCSVDataIntoJavaObjects to test our ConvertCSVDataIntoJavaObjects program
public class TestConvertCSVDataIntoJavaObjects
{
    @Test
    void testReadCSV()
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\Merged_Student.csv";
        List<Student> students = readCSV(filePath);

        // Printing the Student objects
        for (Student student : students)
        {
            System.out.println(student);
        }
    }
}

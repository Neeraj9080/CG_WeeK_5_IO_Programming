package com.io.advancedProblems.ConvertCSVDataIntoJavaObjects;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
// creating class ConvertCSVDataIntoJavaObjects to convert CSV data into Java objects
public class ConvertCSVDataIntoJavaObjects
{
    // Method to read CSV and convert to List of Student objects
    public static List<Student> readCSV(String filePath)
    {
        List<Student> students = new ArrayList<>();

        // Handling IOException
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {
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
                int id = Integer.parseInt(fields[0]);
                String name = fields[1];
                int age = Integer.parseInt(fields[2]);
                students.add(new Student(id, name, age));
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException caught : " + e.getMessage());
        }
        return students;
    }

    // Main method
    public static void main(String[] args)
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


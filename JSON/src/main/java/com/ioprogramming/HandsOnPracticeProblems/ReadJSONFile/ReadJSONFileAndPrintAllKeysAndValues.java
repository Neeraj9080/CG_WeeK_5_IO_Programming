package com.ioprogramming.HandsOnPracticeProblems.ReadJSONFile;
import java.io.FileReader;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONTokener;
import java.util.Iterator;

// Creating class ReadJSONFileAndPrintAllKeysAndValues to read JSON files and print all keys and values
public class ReadJSONFileAndPrintAllKeysAndValues
{
    // Method to display Keys and Values
    public static void displayKeysAndValues(JSONObject jsonObject)
    {
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext())
        {
            String key = keys.next();
            Object value = jsonObject.get(key);

            System.out.println("Key: " + key + ", Value: " + value);

            if (value instanceof JSONObject)
            {
                displayKeysAndValues((JSONObject) value);
            }
            else if (value instanceof JSONArray)
            {
                for (int i = 0; i < ((JSONArray) value).length(); i++)
                {
                    displayKeysAndValues(((JSONArray) value).getJSONObject(i));
                }
            }
        }
    }

    // Main method
    public static void main(String[] args)
    {
        // Handling Exception
        try
        {
            FileReader fileReader = new FileReader("D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_02_JSON\\JSONFiles\\JSONFile.json");
            JSONTokener jsonTokener = new JSONTokener(fileReader);
            JSONObject jsonObject = new JSONObject(jsonTokener);
            // Calling method of the class
            displayKeysAndValues(jsonObject);
        }
        catch (Exception e)
        {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}







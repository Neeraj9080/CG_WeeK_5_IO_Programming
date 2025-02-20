package com.io.advancedProblems.ConvertJSONToCSV;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.*;
// Creating class ConvertJSONToCSVAndViceVersa to convert JSON file into CSV file
public class ConvertJSONToCSVAndViceVersa
{
    // Method to convert JSON to CSV
    public static void jsonToCSV(String jsonFilePath, String csvFilePath)
    {
        // Handling IOException
        try
        {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode rootNode = mapper.readTree(new File(jsonFilePath));
            FileWriter writer = new FileWriter(csvFilePath);
            writer.write("ID,Name,Age\n");

            for (JsonNode node : rootNode)
            {
                writer.write(node.get("ID").asInt() + "," +
                        node.get("Name").asText() + "," +
                        node.get("Age").asInt() + "\n");
            }
            System.out.println("JSON file successfully converted into CSV file!");
            writer.close();
        }
        catch (IOException e)
        {
            System.out.println("IOException caught : " + e.getMessage());
        }
    }

    // Method to convert CSV to JSON
    public static void csvToJSON(String csvFilePath, String jsonFilePath)
    {
        // Handling IOException
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFilePath));)
        {
            ObjectMapper mapper = new ObjectMapper();
            ArrayNode arrayNode = mapper.createArrayNode();
            String line;
            boolean header = true;

            while ((line = bufferedReader.readLine()) != null)
            {
                if (header)
                {
                    header = false;
                    continue;
                }
                String[] fields = line.split(",");
                ObjectNode node = mapper.createObjectNode();
                node.put("ID", Integer.parseInt(fields[0]));
                node.put("Name", fields[1]);
                node.put("Age", Integer.parseInt(fields[2]));
                arrayNode.add(node);
            }
            mapper.writeValue(new File(jsonFilePath), arrayNode);
            System.out.println("CSV file successfully converted into JSON file!");
        }
        catch (IOException e)
        {
            System.out.println("IOException caught : " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args)
    {
        String jsonFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\JSON.json";
        String csvFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\JSONToCSV.csv";
        String outputJsonFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\ConvertedJCSVToJSON.csv";

        // Converting JSON to CSV
        jsonToCSV(jsonFilePath, csvFilePath);
        // Converting JSON to CSV
        csvToJSON(csvFilePath, outputJsonFilePath);
    }
}
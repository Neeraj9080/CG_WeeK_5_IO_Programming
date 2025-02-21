package com.ioprogramming.IPLCensorAnalyzer;
import com.opencsv.exceptions.CsvException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

// Creating class IPLCensorAnalyzer to censor some data
public class IPLCensorAnalyzer
{
    // method to mask team name
    private static String maskTeamName(String teamName)
    {
        return teamName.replaceAll("(?<=\\S{3})\\S", "*");
    }

    // Method to censor match data
    private static void censorMatchData(JSONObject match)
    {
        // Mask team names
        String team1 = match.getString("team1");
        String team2 = match.getString("team2");
        match.put("team1", maskTeamName(team1));
        match.put("team2", maskTeamName(team2));

        // Redact player of the match
        match.put("player_of_the_match", "REDACTED");
    }

    // Method to read and process JSON data
    public static void readAndProcessJSONData(String jsonInputFilePath, String censoredJSONFilePath)
    {
        // Handling IOException
        try
        {
            // Read and process JSON data
            FileReader fileReader = new FileReader(jsonInputFilePath);
            JSONTokener jsonTokener = new JSONTokener(fileReader);
            JSONArray jsonArray = new JSONArray(jsonTokener);
            JSONArray censoredJsonArray = new JSONArray();

            for (int i = 0; i < jsonArray.length(); i++)
            {
                JSONObject match = jsonArray.getJSONObject(i);
                censorMatchData(match);
                censoredJsonArray.put(match);
            }

            FileWriter jsonWriter = new FileWriter(censoredJSONFilePath);
            jsonWriter.write(censoredJsonArray.toString(4));
            System.out.println("JSON Data successfully censored ");
            jsonWriter.flush();
            jsonWriter.close();
        }
        catch (IOException e)
        {
            System.out.println("IOException caught : " + e.getMessage());
        }
    }

    // Method to read and process CSV data
    public static void readAndProcessCSVData(String csvInputFilePath , String censoredCSVFilePath)
    {
        // Handling IOException
        try
        {
            // Read and process CSV data
            CSVReader csvReader = new CSVReader(new FileReader(csvInputFilePath));
            List<String[]> records = csvReader.readAll();
            csvReader.close();

            for (String[] record : records)
            {
                // Mask team names
                record[0] = maskTeamName(record[0]);
                record[1] = maskTeamName(record[1]);
                // Redact player of the match
                record[2] = "REDACTED";
            }

            CSVWriter csvWriter = new CSVWriter(new FileWriter(censoredCSVFilePath));
            csvWriter.writeAll(records);
            System.out.println("CSV Data successfully censored ");
            csvWriter.flush();
            csvWriter.close();
        }
        catch (IOException e)
        {
            System.out.println("IOException caught : " + e.getMessage());
        }
        catch (CsvException e)
        {
            System.out.println("CSV exception caught : " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args)
    {
        String jsonInputFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_02_JSON\\JSONFiles\\JSONInputFile.json";
        String censoredJSONFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_02_JSON\\JSONFiles\\CensoredJSONFile.json";

        // Calling method of the class
        readAndProcessJSONData(jsonInputFilePath, censoredJSONFilePath);

        String csvInputFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_02_JSON\\JSONFiles\\CSVInputFile.csv";
        String censoredCSVFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_02_JSON\\JSONFiles\\CensoredCSVFile.csv";

        // Calling method of the class
        readAndProcessCSVData(csvInputFilePath, censoredCSVFilePath);
    }
}

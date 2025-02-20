package com.io.advancedProblems.TestEncryptAndDecryptCSVData;

import org.junit.jupiter.api.Test;
import javax.crypto.SecretKey;
import static com.io.advancedProblems.EncryptAndDecryptCSVData.EncryptAndDecryptCSVData.*;
// Creating class TestEncryptAndDecryptCSVData to test our EncryptAndDecryptCSVData program
public class TestEncryptAndDecryptCSVData
{
    @Test
    void testEncryptAndDecryptCSVData()
    {
        try {
            SecretKey key = generateKey();
            String inputFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\CSVFile.csv";
            String encryptedFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_5_IO_Programming\\Day_01_CSV_Data_Handling\\EncryptedFilePath.csv";

            // Encrypt and write to CSV
            encryptCSV(inputFilePath, encryptedFilePath, key);

            // Decrypt and read from CSV
            decryptCSV(encryptedFilePath, key);
        }
        catch (Exception e)
        {
            System.out.println("Exception caught : " + e.getMessage());
        }
    }
}

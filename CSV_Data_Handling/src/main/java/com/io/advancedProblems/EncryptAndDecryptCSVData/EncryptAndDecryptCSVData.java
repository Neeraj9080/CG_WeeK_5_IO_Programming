package com.io.advancedProblems.EncryptAndDecryptCSVData;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.util.Base64;

// Creating class EncryptAndDecryptCSVData to encrypt and decrypt CSV data
public class EncryptAndDecryptCSVData
{
    private static final String ALGORITHM = "AES";

    // Method to generate AES SecretKey
    public static SecretKey generateKey() throws Exception
    {
        KeyGenerator keyGen = KeyGenerator.getInstance(ALGORITHM);
        keyGen.init(128);
        return keyGen.generateKey();
    }

    // Method to encrypt data
    private static String encrypt(String data, SecretKey key) throws Exception
    {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    // Method to decrypt data
    private static String decrypt(String encryptedData, SecretKey key) throws Exception
    {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedData);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
        return new String(decryptedBytes);
    }

    // Method to encrypt CSV data and write to file
    public static void encryptCSV(String inputFilePath, String outputFilePath, SecretKey key)
    {
        // Handling IOException and Exception
        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
             FileWriter writer = new FileWriter(outputFilePath))
        {
            String line;
            boolean header = true;

            while ((line = br.readLine()) != null)
            {
                if (header)
                {
                    header = false;
                    writer.write(line + "\n");
                    continue;
                }
                String[] fields = line.split(",");
                fields[3] = encrypt(fields[3], key); // Encrypting Salary field
                writer.write(String.join(",", fields) + "\n");
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception caught : " + e.getMessage());
        }
    }

    // Method to decrypt CSV data and read from file
    public static void decryptCSV(String inputFilePath, SecretKey key)
    {
        // Handling IOException and Exception
        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath)))
        {
            String line;
            boolean header = true;

            while ((line = br.readLine()) != null)
            {
                if (header)
                {
                    header = false;
                    System.out.println(line);
                    continue;
                }
                String[] fields = line.split(",");
                fields[3] = decrypt(fields[3], key); // Decrypting Salary field
                System.out.println(String.join(",", fields));
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
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


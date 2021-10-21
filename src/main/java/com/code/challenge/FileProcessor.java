package com.code.challenge;

import com.code.challenge.util.Constants;

import java.io.*;

public class FileProcessor {

    public static void processInputFile(String inputFileName) {
        FileReader fileReader = null;
        try {
            File file = new File(inputFileName);
            fileReader = new java.io.FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                int entry;
                try {
                    entry = Integer.parseInt(line);
                } catch (NumberFormatException ex) {
                    System.out.println(line + Constants.InvalidFormat);
                    continue;
                }
                PrimeFactorCalculator calc = new PrimeFactorCalculator();
                calc.displayCommaSeparatedPrimeFactors(calc.calculatePrimeFactors(entry), entry);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(Constants.FileNotFound);
        } catch (IOException ex) {
            System.out.println(Constants.IoException);
        } finally {
            if (fileReader != null)
                try {
                    fileReader.close();
                } catch (IOException ex) {
                    System.out.println(Constants.IoException);
                }
        }
    }
}


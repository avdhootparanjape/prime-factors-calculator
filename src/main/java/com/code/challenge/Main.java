package com.code.challenge;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1)
        {
            System.out.println("Please provide a valid input file to proceed further");
            System.exit(1);
        }

        FileProcessor.processInputFile(args[0]);
    }
}


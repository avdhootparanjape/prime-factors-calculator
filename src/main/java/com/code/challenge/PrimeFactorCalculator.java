package com.code.challenge;

import com.code.challenge.util.Constants;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorCalculator {

    public List<Integer> calculatePrimeFactors(int inputNumber) {
        List<Integer> primeFactors = new ArrayList<>();

        for (int i = 2; i <= inputNumber; i++)
        {
            if (inputNumber % i == 0)
            {
                primeFactors.add(i);
                inputNumber /= i;
                i--;
            }
        }
        return primeFactors;
    }

    public void displayCommaSeparatedPrimeFactors(List<Integer> primeFactors, int entry) {
        System.out.print(entry + ": ");
        if(primeFactors.size() == 0) {
            System.out.print(Constants.NoPrimeFactors);
        }
        String separator = "";
        for (Integer i:primeFactors) {
            System.out.print(separator + i);
            separator = ",";
        }
        System.out.println();
    }
}


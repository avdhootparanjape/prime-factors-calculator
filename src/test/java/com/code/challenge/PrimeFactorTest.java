package com.code.challenge;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PrimeFactorTest {
    private PrimeFactorCalculator primeFactor = new PrimeFactorCalculator();
    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public  void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public   void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void testValidNumber() {
        List<Integer> listOfPrimeFactor = primeFactor.calculatePrimeFactors(5);
        assertEquals(true, listOfPrimeFactor.contains(5));
    }

    @Test
    public void testPrimeFactorDisplay() {
        List<Integer> primeFactors = new ArrayList<>();
        primeFactors.add(5);
        primeFactor.displayCommaSeparatedPrimeFactors(primeFactors, 5);
        String s = outContent.toString();
        assertEquals("5: 5\n", outContent.toString());
    }

    @Test
    public void testInValidNumber() {
        List<Integer> listOfPrimeFactor = primeFactor.calculatePrimeFactors(1);
        assertEquals(false, listOfPrimeFactor.contains(1));
    }

}
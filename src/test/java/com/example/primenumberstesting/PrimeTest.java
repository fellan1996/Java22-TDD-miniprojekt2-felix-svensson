package com.example.primenumberstesting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    @DisplayName("input '0, -1'. NumOfPrimes should be 0")
    void testNegativeSecondNumberShouldNotHavePrimes1() {
        Prime prime = new Prime(0, -1);
        assertEquals(0, prime.getPrimes().get(0));
    }
    @Test
    @DisplayName("input '0, -1'. SumOfPrimes should be 0")
    void testNegativeSecondNumberShouldNotHavePrimes2() {
        Prime prime = new Prime(0, -1);
        assertEquals(0, prime.getPrimes().get(1));
    }
    @Test
    @DisplayName("input '0, -1'. The primes List should have size=2 ")
    void testNegativeSecondNumberShouldNotHavePrimes3() {
        Prime prime = new Prime(0, -1);
        assertEquals(2, prime.getPrimes().size());
    }
    @Test
    @DisplayName("input '-1, 0'. NumOfPrimes should be 0")
    void testNegativeFirstNumberShouldNotHavePrimes1() {
        Prime prime = new Prime(-1, 0);
        assertEquals(0, prime.getPrimes().get(0));
    }
    @Test
    @DisplayName("input '-1, 0'. SumOfPrimes should be 0")
    void testNegativeFirstNumberShouldNotHavePrimes2() {
        Prime prime = new Prime(-1, 0);
        assertEquals(0, prime.getPrimes().get(1));
    }
    @Test
    @DisplayName("input '-1, 0'. The primes List should have size=2 ")
    void testNegativeFirstNumberShouldNotHavePrimes3() {
        Prime prime = new Prime(-1, 0);
        assertEquals(2, prime.getPrimes().size());
    }
    @Test
    @DisplayName("input '1000, 1001'. The primes List should have size=2")
    void testTooBigSecondNumberShouldNotHavePrimes() {
        Prime prime = new Prime(0, -1);
        assertEquals(2, prime.getPrimes().size());
    }
    @Test
    @DisplayName("input '0, 0'. The primes List should have size=2")
    void test0IsNotAPrimeNumber() {
        Prime prime = new Prime(0, 0);
        assertEquals(2, prime.getPrimes().size());
    }
    @Test
    @DisplayName("input '0, 1'. The primes List should have size=3")
    void test1IsNotAPrimeNumber() {
        Prime prime = new Prime(0, 1);
        assertEquals(2, prime.getPrimes().size());
    }
    @Test
    @DisplayName("input '0, 2'. The primes List should have size=3")
    void test2IsTheFirstPrimeNumber() {
        Prime prime = new Prime(0, 2);
        assertEquals(3, prime.getPrimes().size());
    }
    @Test
    @DisplayName("input '0, 5'. The primes List should have size=5")
    void testInput0To5Outputs3Primes() {
        Prime prime = new Prime(0, 5);
        assertEquals(5, prime.getPrimes().size());
    }
    @Test
    @DisplayName("input '0, 1000'. The primes List should have size=170")
    void testInput0To1000Outputs168Primes() {
        Prime prime = new Prime(0, 1000);
        assertEquals(170, prime.getPrimes().size());
    }
    @Test
    @DisplayName("input '0, 1000'. Number of primes should be 168")
    void testInput0To1000Outputs168Primes2() {
        Prime prime = new Prime(0, 1000);
        int listOfPrimesSize = prime.getPrimes().size();
        assertEquals(168, prime.getPrimes().get(listOfPrimesSize-2));
    }
    @Test
    @DisplayName("input '0, 1000'. Total sum should be 76127")
    void testInput0To1000Outputs168Primes3() {
        Prime prime = new Prime(0, 1000);
        int listOfPrimesSize = prime.getPrimes().size();
        assertEquals(76127, prime.getPrimes().get(listOfPrimesSize-1));
    }
    @Test
    @DisplayName("input '500, 1000'. Length of List should be 75")
    void testFirstNumberInputCanBeMoreThanZero1() {
        Prime prime = new Prime(500, 1000);
        assertEquals(75, prime.getPrimes().size());
        }
    @Test
    @DisplayName("input '3, 1000'. Length of List should be 169")
    void testFirstNumberInputCanBeMoreThanZero2() {
        Prime prime = new Prime(3, 1000);
        assertEquals(169, prime.getPrimes().size());
        }
    @Test
    @DisplayName("input '3, 5'. SumOfPrimes should be 8")
    void testFirstNumberInputCanBeMoreThanZero3() {
        Prime prime = new Prime(3, 5);
        int listLength = prime.getPrimes().size();
        assertEquals(8, prime.getPrimes().get(listLength-1));
        }
    @Test
    @DisplayName("input '-1, 5'. printCount() should return errorMessage")
    void testPrintCountReturnsErrorMessage() {
        Prime prime = new Prime(-1, 5);
        assertEquals("Hoppsan, fel intervall angivet!", prime.printCount());
        }
    @Test
    @DisplayName("input '1, 5'. printSum() should return correct message")
    void testPrintSumReturnsCorrectMessage() {
        Prime prime = new Prime(1, 5);
        assertEquals("Och den totala summan av dessa primtal är 10.", prime.printSum());
        }
    @Test
    @DisplayName("input '1, 5'. printSum() should return correct message")
    void testPrintCountReturnsCorrectMessage() {
        Prime prime = new Prime(1, 5);
        assertEquals("Hej, det finns 3 primtal mellan 1 och 5!", prime.printCount());
        }
}
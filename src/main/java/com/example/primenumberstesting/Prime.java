package com.example.primenumberstesting;

import java.util.ArrayList;
import java.util.List;

public class Prime {

    /**
     * This program counts the sum and the number of prime (int) numbers in interval 0-1000
     */
    private final List<Integer> primes;
    private int count = 0;
    private final boolean wrongInterval;
    private int sumOfPrimes = 0;
    private final int firstNumber;
    private final int lastNumber;

    public Prime(int firstNumber, int lastNumber) {
        this.firstNumber = firstNumber;
        this.lastNumber = lastNumber;

        primes = new ArrayList<>();
        wrongInterval = firstNumber < 0 || lastNumber > 1000 || firstNumber > lastNumber;
        calculatePrimes(firstNumber, lastNumber);

    }

    private boolean numIsPrime(int current, float stop, int divisibleBy) {
        if (divisibleBy > stop) {
            return true;
        } else if (current % divisibleBy == 0) {
            return false;
        }
        return numIsPrime(current, stop, ++divisibleBy);
    }

    private void calculatePrimes(int current, int stop) {
        if (current > stop || current < 0 || stop < 2) {
            primes.add(count);
            primes.add(sumOfPrimes);
            printCount();
            printSum();
        } else if (current > 1 && numIsPrime(current, current / 2.0f, 2)) {
            primes.add(current);
            ++count;
            sumOfPrimes += current;
            calculatePrimes(++current, stop);
        } else {
            calculatePrimes(++current, stop);
        }
    }

    public List<Integer> getPrimes() {
        return primes;
    }

    public String printCount() {
        String printStatement;
        if (wrongInterval) {
            printStatement = "Hoppsan, fel intervall angivet!";
        } else {
            printStatement = "Hej, det finns " + count + " primtal mellan " + firstNumber + " och " + lastNumber + "!";
        }
        System.out.println(printStatement);
        return printStatement;
    }

    public String printSum() {
        String printStatement;
        if (wrongInterval) {
            printStatement = "Hoppsan, fel intervall angivet!";
        } else {
            printStatement = "Och den totala summan av dessa primtal är " + sumOfPrimes + ".";
            System.out.println(printStatement);
        }
        return printStatement;
    }
}

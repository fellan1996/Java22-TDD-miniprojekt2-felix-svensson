package com.example.primenumberstesting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an interval between 0 and 1000. The two integers should be seperated by a comma, ex: '20,500'");
        String[] userInput = scanner.nextLine().split(",");
        int firstNumber = Integer.parseInt(userInput[0].trim());
        int lastNumber = Integer.parseInt(userInput[1].trim());
        Prime prime = new Prime(firstNumber, lastNumber);
    }
}

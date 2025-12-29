package com.rampada.basics;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator!");
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Choose operation: +, -, *, /");
        String op = scanner.next();

        double result = 0;
        boolean valid = true;

        switch (op) {
            case "+":
                result = calculator.add(a, b);
                break;
            case "-":
                result = calculator.subtract(a, b);
                break;
            case "*":
                result = calculator.multiply(a, b);
                break;
            case "/":
                try {
                    result = calculator.divide(a, b);
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid operation");
                valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}


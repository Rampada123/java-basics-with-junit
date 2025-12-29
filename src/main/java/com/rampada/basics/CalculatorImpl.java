package com.rampada.basics;

//CalculatorImpl.java
public class CalculatorImpl implements Calculator {

 @Override
 public int add(int a, int b) {
     return a + b;
 }

 @Override
 public int subtract(int a, int b) {
     return a - b;
 }

 @Override
 public int multiply(int a, int b) {
     return a * b;
 }

 @Override
 public double divide(int a, int b) throws ArithmeticException {
     if (b == 0) {
         throw new ArithmeticException("Cannot divide by zero");
     }
     return (double) a / b;
 }
}


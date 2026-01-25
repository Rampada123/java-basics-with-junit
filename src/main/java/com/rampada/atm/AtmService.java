package com.rampada.atm;

public class AtmService {

    private double balance;

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {                   // amount =12000/- >0
            balance = balance + amount;
            System.out.println("Amount deposited successfully: " + amount);
            System.out.println("Current balance: " + balance);  // balance+amount= 0+12000= 12000/-
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance = balance - amount;  // balance =12000-5000= 7000/-
            System.out.println("Withdrawal successful: " + amount);
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

        public double getBalance() {
        return balance;
    }
}

package com.rampada.practiceSet;

/*An ATM system checks withdrawal requests.
Take two inputs:
account balance
withdrawal amount
If withdrawal amount is less than or equal to balance, display “Transaction Successful”.
Otherwise, display “Insufficient Balance”.*/

public class AtmSystem {
    private double balance = 10000.00;

    // method to check withdrawal
    public void withdrawAmount(double withdraw) {
        if (withdraw <= balance) {
            balance = balance - withdraw;
            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    
    public double getBalance() {
    	return balance;
    }
}

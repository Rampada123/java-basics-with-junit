/*package com.rampada.atm;

import java.util.Scanner;

public class AtmMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AtmService atm = new AtmService();

        System.out.println("Enter deposit amount:"); //12000/-
        double depositAmount = sc.nextDouble();
        atm.deposit(depositAmount);

        System.out.println("Enter withdrawal amount:");
        double withdrawAmount = sc.nextDouble();
        atm.withdraw(withdrawAmount); //5000/-

        System.out.println("Final balance: " + atm.getBalance()); //12000-5000=7000/-

        sc.close();
    }
}*/












package com.rampada.atm;

import java.util.Scanner;

public class AtmMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AtmService atm = new AtmService();

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Current balance: " + atm.getBalance());
                    break;

                case 4:
                    System.out.println("Thank you for using ATM ");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}

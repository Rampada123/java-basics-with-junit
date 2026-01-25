package com.rampada.practiceSet;
import java.util.*;

public class AtmAPP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AtmSystem atm = new AtmSystem();
        System.out.println("Your cuurent balance: "+atm.getBalance());
        
        System.out.print("Enter withdrawal amount: ");
        double withdraw2 = sc.nextDouble();

        
        atm.withdrawAmount(withdraw2);

        sc.close();
    }
}

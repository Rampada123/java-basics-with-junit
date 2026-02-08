package com.rampada.practiceSet;

public class HospitalOPD {
    public static void main(String[] args) {

        // Creating patient object
        Patient patient1 =new Patient(201, "Anita", 65, "Fever", "Emergency");

        // Calculate and display bill
        patient1.calculateBill();
    }
}

/*Hospital OPD Token & Fee System* A small hospital wants to automate
 *  its OPD (Out Patient Department). *Each patient has:* patientId name age diseaseType visitType
 *   *Disease Type* (use switch) Fever → ₹200 Cold & Cough → ₹150 Stomach Pain → ₹300 Headache → ₹100
 *    *Visit Type (use switch)* Normal OPD Emergency Emergency adds ₹500 extra. *Age-based Discount (use if-else)
 *    * Age < 5 → Free treatment Age ≥ 5 and ≤ 60 → No discount Age > 60 → 40% discount *Final Output* Print:
 *     Patient details Disease fee Emergency charge (if any) Final payable amount
 */
package com.rampada.practiceSet;
class Patient {

    // Encapsulation: private variables
    private int patientId;
    private String name;
    private int age;
    private String diseaseType;
    private String visitType;

    // Constructor
    public Patient(int patientId, String name, int age, String diseaseType, String visitType) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diseaseType = diseaseType;
        this.visitType = visitType;
    }

    // Method to calculate and display final fee
    public void calculateBill() {

        double diseaseFee = 0;
        double emergencyCharge = 0;
        double finalAmount = 0;

        // Disease fee using switch
        switch (diseaseType) {
            case "Fever":
                diseaseFee = 200;
                break;
            case "Cold & Cough":
                diseaseFee = 150;
                break;
            case "Stomach Pain":
                diseaseFee = 300;
                break;
            case "Headache":
                diseaseFee = 100;
                break;
            default:
                System.out.println("Invalid Disease Type");
                return;
        }

        // Visit type using switch
        switch (visitType) {
            case "Emergency":
                emergencyCharge = 500;
                break;
            case "Normal OPD":
                emergencyCharge = 0;
                break;
            default:
                System.out.println("Invalid Visit Type");
                return;
        }

        finalAmount = diseaseFee + emergencyCharge;

        // Age-based discount using if-else
        if (age < 5) {
            finalAmount = 0; // Free treatment
        } else if (age > 60) {
            finalAmount = finalAmount * 0.6; // 40% discount
        }

        //Final Output
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease Type: " + diseaseType);
        System.out.println("Visit Type: " + visitType);
        System.out.println("Disease Fee: ₹" + diseaseFee);
        System.out.println("Emergency Charge: ₹" + emergencyCharge);
        System.out.println("Final Payable Amount: ₹" + finalAmount);
    }
}

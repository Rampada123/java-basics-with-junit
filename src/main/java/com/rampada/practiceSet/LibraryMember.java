/*Q.Smart Library Membership System* A Smart Library wants to automate its membership system. 
 * Each member: Has a memberId Has a name Chooses a membership type Membership types:
 *  Student Regular Premium The monthly fee depends on the membership type: Student → ₹100 Regular → ₹200 
 *  Premium → ₹300 The library gives a discount based on age: Age < 18 → 50% discount Age ≥ 18 and ≤ 60 → No discount 
 *  Age > 60 → 30% discount *Requirements* You must: Use a constructor to initialize member details 
 *  Use encapsulation (private variables + getters/setters) Use a switch statement to determine membership 
 *  fee Use if-else to apply discount based on age Display the final payable amount.
 */

package com.rampada.practiceSet;
class LibraryMember {

    // Encapsulation: private variables
    private int memberId;
    private String name;
    private int age;
    private String membershipType;

    // Constructor to initialize member details
    public LibraryMember(int memberId, String name, int age, String membershipType) {
        this.memberId = memberId;
        this.name = name;
        this.age = age;
        this.membershipType = membershipType;
    }

    //  Getters and Setters
    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMembershipType() {
        return membershipType;
    }

    //  Method to calculate final fee
    public void calculateFinalFee() {
        double fee = 0;

        // Switch to decide base fee
        switch (membershipType) {
            case "Student":
                fee = 100;
                break;
            case "Regular":
                fee = 200;
                break;
            case "Premium":
                fee = 300;
                break;
            default:
                System.out.println("Invalid Membership Type");
                return;
        }

        // Discount based on age
        if (age < 18) {
            fee = fee * 0.5; // 50% discount
        } else if (age > 60) {
            fee = fee * 0.7; // 30% discount
        }

        // Display output
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Final Payable Amount: ₹" + fee);
    }
}

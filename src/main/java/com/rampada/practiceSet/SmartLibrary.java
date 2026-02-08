package com.rampada.practiceSet;
public class SmartLibrary {
    public static void main(String[] args) {

        // Creating object using constructor
        LibraryMember member1 =
                new LibraryMember(101, "Rahul", 61, "Student");

        // Calling method
        member1.calculateFinalFee();
    }
}

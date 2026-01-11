package com.rampada.encapsulation;

class Teacher {

    public static void main(String[] args) {

        Student s = new Student();

        // Teacher sets student details
        s.setName("Rohit");
        s.setMarks(-1000);   // ✅ valid marks

        System.out.println("Student Name: " + s.getName());
        
        if(s.getMarks()>0) {
        System.out.println("Marks: " + s.getMarks());
        }
        
        System.out.println("Invalid marks");
        // Trying to give invalid marks
       // s.setMarks(120);  // ❌ invalid
    }
}

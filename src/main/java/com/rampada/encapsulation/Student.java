package com.rampada.encapsulation;

class Student {

    // 🔒 Data hiding
    private String name;
    private int marks;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    } 

    // Setter for marks (with validation)
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Marks should be between 0 and 100.");
        }
    }

    // Getter for marks
    public int getMarks() {
        return marks;
    }
}

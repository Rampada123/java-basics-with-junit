package com.rampada.constructor;

public class Student {
	
	String name;
	int age;
	
	// Parameterized Constructor
	Student(String n, int a){
		name=n;
		age=a;	
		
		System.out.println("Name of student is :"+name);
		System.out.println("Age of student is :"+age);
	}
	
	//Default Constructor 
	Student(){
		name="Sourav";
		age= 25;
	
	}
	
	void details() {
		System.out.println("Student name is :"+name);
		System.out.println("Student Age is :"+age);
	}

}

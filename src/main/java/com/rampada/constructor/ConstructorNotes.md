**JAVA CONSTRUCTOR**

**1️. What is a Constructor? (Definition)**
A constructor is a special block of code that is executed automatically when an object is created.
It is mainly used to initialize instance variables and ensure the object starts in a valid state.
Explanation: Constructor হলো এমন একটা special অংশ, যেটা object জন্ম নেওয়ার সাথে সাথেই চলে এবং object-টাকে ঠিকঠাকভাবে প্রস্তুত করে।

**2️. Key Characteristics of Constructor**

**Rule**	                **Explanation**
Name	                   Same as class name
Return type	            No return type
Call	                   Automatically called using new
Purpose	                   Initialization + validation
Inheritance	            Not inherited but executed

**3️. Constructor Classification**

🔹* 1. Default Constructor*

class Student {
    Student() {
        System.out.println("Student created");
    }
}
📌Takes no parameters
Explanation: কিছু না দিয়েই object বানানো, Java নিজেও এটা দিতে পারে

🔹* 2. Parameterized Constructor*

class Student {
    int roll;
    String name;

    Student(int r, String n) {
        roll = r;
        name = n;
    }
}
📌 Takes parameters
📌 Used when data is mandatory

Explanation:  নাম, রোল না দিলে admission হবে না

**4️. What happens if constructor is NOT written?**

Scenario
class Human {
    String brain;
	}

Public class Main{
	Public static void main(String[] args){
	Human h = new Human();
	System.out.println(h.brain);
	}
     }
Output
null

*Why?*
•	Java provides a compiler-generated default constructor
•	Instance variables get default values

**Type**	           **Default**
int	                      0
String	                  null

**5️. Constructor exists but variable not initialized**

class Human {
    String brain;

    Human() {
        System.out.println("Human born");
    }
}

Human h = new Human();
System.out.println(h.brain);

*Output*
Human born
null
📌 Constructor থাকা মানেই variable initialized হবে — এটা ভুল ধারণা

**6️. WHEN should we use Constructor? (MOST IMPORTANT)**

** Use constructor when data is MANDATORY

*Scenario1*: Student Admission
class Student {
    int roll;
    String name;

    Student(int r, String n) {
        roll = r;
        name = n;
    }
}

Student sourav = new Student(1, "Sourav");

*Scenario2:* Bank Account 
class BankAccount {
    int accountNumber;
    int balance;

    BankAccount(int accNo, int bln) {
        accountNumber = accNo;
        balance = bln;
    }
}
📌 Account valid from create

**7️. WHEN NOT to use Constructor**
 When data is OPTIONAL
 
class Profile {
    String name;
    String bio;

    Profile(String name) {
        this.name = name;
    }

    void setBio(String bio) {
        this.bio = bio;
    }
}
Explanation: Facebook profile — bio না থাকলেও চলে

When step-by-step setup is required
class Maggi {
    void addWater() {}
    void addMasala() {}
}

**8️. Constructor vs Method (VERY IMPORTANT CONFUSION)**

Can we use method instead of constructor?
Yes, technically possible 
class BankAccount {
    int accountNumber;
    int balance;

    void setData(int accNo, int bal) {
        accountNumber = accNo;
        balance = bal;
    }
}
BankAccount acc = new BankAccount();
acc.setData(123, 5000);

 BUT BIG PROBLEM
BankAccount acc = new BankAccount();
// account already exists but invalid
Explanation: Account খুলে ফেলেছি, কিন্তু details পরে দেবো মাঝখানে account usable.
Constructor Solution
BankAccount acc = new BankAccount(123, 5000);
📌 Invalid object create-ই হতে পারবে না

**9️. Constructor vs Method (Clear Table)**
Point	Constructor	Method
When called	Object creation	Anytime
Purpose	Initialization	Behavior
Can avoid invalid state	 Yes	No
Mandatory data	 Best	 Risky



**10. Constructor with normal method:**
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


public class Main {
	public static void main(String[] args) {
		
		Student s=new Student("Suman", 24);
		
		Student s1=new Student();
		s1.details();
		
	}
}
**11. Funny Example**

class Student {
    String brain;

    Student(String name) {
        brain = "Installed";
        System.out.println(name + " is born with brain");
    }
}

public class Main {
    public static void main(String[] args) {
        Student sourav = new Student("Sourav");
        Student suman = new Student("Suman");
        Student arghya = new Student("Arghyadeep");
    }
}
*Output*
Sourav is born with brain
Suman is born with brain
Arghyadeep is born with brain
😄 Without constructor → Sourav, Suman and Arghyadeep are mad.


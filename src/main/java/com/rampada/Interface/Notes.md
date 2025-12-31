   ##What we Learned Today##
   
Today we learned Java Interface concepts in depth, including: - What an interface is - Why interfaces are used - How to implement an interface - Interface rules (before Java 8) - Java 8 features related to interfaces - Default methods and overriding them
________________________________________
🔹 **What is an Interface in Java?**

An interface is a blueprint of a class. It contains: - Abstract methods (by default) - Constants (public static final)
It is used to achieve: - Abstraction - Loose coupling - Multiple inheritance
________________________________________
🔹 **Why Interface is Important (Practical Use)**

•	Defines what to do, not how to do
•	Helps in changing implementation without affecting code
•	Widely used in real projects, APIs, and frameworks (Spring, Hibernate)
________________________________________
🔹 **Interface Example (Basic)**

Remote.java (Interface)
package Ram;

public interface Remote {
    void on();
    void off();
}
________________________________________
**Code: Lg.java (Implementation Class**

package Ram;

public class Lg implements Remote {

    @Override
    public void on() {
        System.out.println("Remote ON");
    }

    @Override
    public void off() {
        System.out.println("Remote OFF");
    }
}
________________________________________
**code: RemoteApp.java (Main Class)**

package Ram;

public class RemoteApp {
    public static void main(String[] args) {
        Remote r = new Lg();
        r.on();
        r.off();
    }
}
________________________________________
🔹 **Key Concept Used Here**

•	Interface reference pointing to implementation object
•	This is called Polymorphism
Remote r = new Lg();
________________________________________
🔹 **Java Versions Explained**

Java 1.8 Means
•	Java 1.8 = Java 8
Before Java 8
•	Interface could have only abstract methods
Java 8 and After
•	Interface can have:
o	default methods
o	static methods
________________________________________
🔹 **Java 8 Default Method in Interface**

Interface with Default Method
public interface Remote {
    void on();
    void off();

    default void batteryStatus() {
        System.out.println("Battery is OK");
    }
}
________________________________________
**Case 1:** Default Method NOT Implemented in Class
public class Lg implements Remote {
    public void on() {}
    public void off() {}
}
✔ No error ✔ Default method is inherited automatically
________________________________________
**Case 2:** Default Method Overridden in Class
@Override
public void batteryStatus() {
    System.out.println("LG battery is 80%");
}
✔ Class version overrides interface default method
________________________________________
🔹 **Important Rules of Interface**

Rule	Description
Interface methods	Public & abstract by default
Variables	public static final
Object creation	Not allowed
Multiple inheritance	Allowed
Default methods	Allowed from Java 8
________________________________________
🔹 **Interview Notes**

•	Java interface supports multiple inheritance
•	Default methods were introduced to avoid breaking old code
•	Interface reference promotes loose coupling
________________________________________
**✅ Summary**
✔ Learned interface basics ✔ Implemented interface using class ✔ Understood Java 8 default methods ✔ Clear difference between Java 7 and Java 8 ✔ Hands-on coding practice
________________________________________


package com.rampada.class_Object;

public class Human {

    public static void main(String[] args) {

        Phone myPhone = new Phone();

        // putting values into phone
        myPhone.brand = "iphone";
        myPhone.battery = 99;
        myPhone.colour = "White";

        // human uses the phone
        myPhone.ring();
        myPhone.showDetails();
        
        Phone sourav = new Phone();
        sourav.brand ="Samsung";
        sourav.battery = 52;
        sourav.colour ="Red";
        sourav.ring();
        sourav.showDetails();
    }
}


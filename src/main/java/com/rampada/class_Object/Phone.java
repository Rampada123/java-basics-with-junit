package com.rampada.class_Object;

public class Phone {

    // data (what phone has)
    String brand;
    int battery;
    String colour;

    // behavior (what phone does)
    void ring() {
        System.out.println("Tring Tring... Phone is ringing!");
    }

    void showDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Battery : " + battery + "%");
        System.out.println("colour : " + colour);
    }
}

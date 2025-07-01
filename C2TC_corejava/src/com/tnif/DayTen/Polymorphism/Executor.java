package com.tnif.DayTen.Polymorphism;

public class Executor {
    public static void main(String[] args) {
        // Overloaded method calls
        System.out.println("1. Addition: " + Overloading.addition("hello", "world"));
        System.out.println("2. Addition: " + Overloading.addition(12, 100));
        System.out.println("3. Addition: " + Overloading.addition(10.4f, 67f));
        System.out.println("4. Addition: " + Overloading.addition(35.8f, 156));
        System.out.println("5. Addition: " + Overloading.addition(25.4f, 26.6f)); 
        
        Person p1 = new Person();
        System.out.println(p1);

        p1 = new Person(006, "Bharu");
        System.out.println(p1);

        p1 = new Person(6, "Bharu", "Chennai");
        System.out.println(p1);
    }
}

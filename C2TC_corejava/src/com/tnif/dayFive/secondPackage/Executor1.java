package com.tnif.dayFive.secondPackage;

import com.tnif.dayFive.firstPackage.Base;


public class Executor1 {
    public static void main(String[] args) {
        // Creating object of Base class from another package
        Base b1 = new Base();

        // Accessing public method and variable from Base class
        b1.methodPublic();
        b1.varPublic = 41;
        b1.methodPublic();
    }
}

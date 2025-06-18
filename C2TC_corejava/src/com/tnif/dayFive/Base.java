package com.tnif.dayFive;

public class Base {
    int varDefault = 10;               // Default access
    public int varPublic = 20;         // Public access
    private int varPrivate = 30;       // Private access
    protected int varProtected = 40;   // Protected access

    // Default Constructor
    public Base() {
        System.out.println("🚀 Base Constructor Executed");
    }

    // Default method
    void methodDefault() {
        System.out.println("👉 Default access method in Base class");
        System.out.println("Default Variable: " + varDefault);
    }

    // Public method
    public void methodPublic() {
        System.out.println("🌐 Public access method in Base class");
        System.out.println("Public Variable: " + varPublic);
    }

    // Private method
    private void methodPrivate() {
        System.out.println("🔒 Private access method in Base class");
        System.out.println("Private Variable: " + varPrivate);
    }

    // Protected method
    protected void methodProtected() {
        System.out.println("🛡️ Protected access method in Base class");
        System.out.println("Protected Variable: " + varProtected);
    }

    // Optional method to demo private method from inside class
    public void callPrivate() {
        methodPrivate(); // can only be called from within the class
    }
}

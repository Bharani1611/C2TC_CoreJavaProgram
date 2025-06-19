package com.tnif.daysix.task_Singleinheritance;

public class Student {
    // Singleton instance
    private static Student obj = new Student();

    // Instance variables
    private String studentName;
    private int studentAge;

    // Private constructor to restrict object creation
    private Student() {
        // Default constructor
    }

    // Public method to get the singleton object
    public static Student getObj() {
        return obj;
    }

    // Getters and setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    // Optional: toString to display details
    @Override
    public String toString() {
        return "Name: " + studentName + ", Age: " + studentAge;
    }
}

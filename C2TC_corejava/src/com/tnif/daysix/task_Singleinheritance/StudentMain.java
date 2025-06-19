package com.tnif.daysix.task_Singleinheritance;

public class StudentMain {
    public static void main(String[] args) {

        Student obj = Student.getObj();

        obj.setStudentName("Bharani");
        obj.setStudentAge(21);

        Student obj1 = Student.getObj();

        System.out.println("👤 Student 1: " + obj);
        System.out.println("👤 Student 2: " + obj1);

        
    }
}

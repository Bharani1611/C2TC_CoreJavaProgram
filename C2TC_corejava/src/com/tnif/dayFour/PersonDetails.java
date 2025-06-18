package com.tnif.dayFour;

import java.util.Scanner;

public class PersonDetails {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter Person Name: ");
        String name = ob.next();

        System.out.print("Enter Age: ");
        int age = ob.nextInt();

        System.out.print("Enter Gender: ");
        String gender = ob.next();

        System.out.print("Enter Taxable Income: ");
        int income = ob.nextInt();

        PersonClass person = new PersonClass();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        person.setIncome(income);

        System.out.println("\nBefore Tax Calculation:");
        System.out.println(person);

        TaxCalculation calc = new TaxCalculation();
        calc.calculateTax(person);

        System.out.println("\nAfter Tax Calculation:");
        System.out.println(person);

        ob.close();
    }
}

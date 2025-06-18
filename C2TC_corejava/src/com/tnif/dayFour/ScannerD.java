package com.tnif.dayFour;

import java.util.Scanner;

public class ScannerD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter your city: ");
        String city = input.nextLine();

        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("City: " + city);
    }
}

package day3;

import java.util.Scanner;

public class CustomerEntryDetails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First Customer using default constructor + setters
        System.out.print("Enter Customer Id : ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Customer Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Customer City : ");
        String city = sc.nextLine();

        CustomerClass c1 = new CustomerClass();
        c1.setCustomerId(id);
        c1.setCustomerName(name);
        c1.setCustomerCity(city);

        System.out.println("\nCustomer 1 Details:");
        System.out.println(c1);

        // Second Customer using parameterized constructor
        System.out.print("\nEnter Customer Id : ");
        id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Customer Name : ");
        name = sc.nextLine();

        System.out.print("Enter Customer City : ");
        city = sc.nextLine();

        CustomerClass c2 = new CustomerClass(name, id, city);

        System.out.println("\nCustomer 2 Details:");
        System.out.println(c2);

        sc.close();
    }
}

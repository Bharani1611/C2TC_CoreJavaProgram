package com.tnif.DayEleven.finally_block;

import java.util.InputMismatchException;
import java.util.Scanner;

public class finally_block {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter the number : ");
			int number = scanner.nextInt();
			System.out.println(number % 2 == 0 ? number + " is Even" : number + " is Odd");
		} catch (InputMismatchException e) {
			System.out.println("Invalid input...");

		} finally {
			System.out.println("In Finally....");
			scanner.close();
		}

	}
}
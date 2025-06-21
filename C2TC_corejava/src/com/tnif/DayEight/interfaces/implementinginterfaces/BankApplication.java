package com.tnif.DayEight.interfaces.implementinginterfaces;

public class BankApplication {
	 public static void main(String[] args) {
	     // Create a Bank instance
	     Bank bank = new BankImpl();

	     // Create an Account
	     Account account = new Account(006, "BHARANI>K", 1550000, bank);

	     // Deposit money
	     account.deposit(2000000);
	     // Print the account details
	     System.out.println(account);
	     
			
			  //withdraw money 
	     	account.withdraw(100000); // Print the account details
			  System.out.println(account);
			  account.withdraw(200000); // Print the account details
			  System.out.println(account); 
			  
			 
	 }
	}
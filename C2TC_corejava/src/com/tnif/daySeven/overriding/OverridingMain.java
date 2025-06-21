package com.tnif.daySeven.overriding;

public class OverridingMain {
	
	public static void main(String[] args) {
		RBI rbi;
		
		
		System.out.println("Bharani.K you Balance");


		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());

	}

}

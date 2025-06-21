package com.tnif.daySeven.overloading;

public class OverloadingMain {
	public static void main(String[] args) {
		System.out.println(MethodOverloading.addition(10, 20));
		System.out.println(MethodOverloading.addition(10.5f, 5.5f));
		System.out.println(MethodOverloading.addition("Hi ", "Bharani"));

		Point p1 = new Point();
		Point p2 = new Point(7.5f);
		Point p3 = new Point(3.0f, 4.0f);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}

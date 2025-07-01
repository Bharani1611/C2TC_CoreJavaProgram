package com.tnif.DayTen.Polymorphism;

public class Person {
	
	private int pid;
	private String name;
	private String city;

	// Constructor with all 3 values
	public Person(int pid, String name, String city) {
		this.pid = pid;
		this.name = name;
		this.city = city;
	}

	// Constructor with 2 values
	public Person(int pid, String name) {
		this.pid = pid;
		this.name = name;
		this.city = "Unknown";
	}

	// Default constructor
	public Person() {
		this.pid = 106;
		this.name = "Bharan";
		this.city = "Chennai";
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", city=" + city + "]";
	}
}

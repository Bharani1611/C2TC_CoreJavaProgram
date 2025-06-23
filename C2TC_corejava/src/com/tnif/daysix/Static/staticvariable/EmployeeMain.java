package com.tnif.daysix.Static.staticvariable;

public class EmployeeMain {
	public static void main(String[] args) {
		// Create the first object of the class and pass the two arguments with type
		// string and int.
		//System.out.println(Employee.companyName);
		Employee e = new Employee("Bharani", 123);
		System.out.println(e);
		
		// Similarly, create the second object of the class and pass the two arguments.
		e = new Employee("Naveen", 321);
		System.out.println(e);
	}
	

}

package com.tnif.daysix.hierarchicalinheritance;

public class hierarchicalMain {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Person p;
		p = new Person("Naveen", "Mumbai");
		if (p instanceof Person)
			System.out.println("Person Details "+p);
		
		p = new Employee("Bhrani", "Mumbai", 101, 67000, "Sales");
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
		

		p = new Student("Rohith", "Pune", "FE", 88);
		if (p instanceof Student)
			System.out.println("Student Details "+p);

	}
	

}

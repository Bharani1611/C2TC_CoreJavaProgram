package com.tnif.DayTen.Task.Polymorphism.overriding;

public class Executor {
	
	public static void main(String[]args) {
		shape s1=new shape();
		s1.calArea();
		
		s1=new square(6.9f);
		s1.calArea();
		
		s1=new rectangle(6.9f,12.8f);
		s1.calArea();
		
		
	}

}

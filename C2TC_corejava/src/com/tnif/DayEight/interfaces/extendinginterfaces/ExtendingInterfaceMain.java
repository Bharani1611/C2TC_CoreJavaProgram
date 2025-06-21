package com.tnif.DayEight.interfaces.extendinginterfaces;

public class ExtendingInterfaceMain implements ChildInterface {
	// Override ChildInterface method
	public void print() { 
		System.out.println("print method");
	}

	// Override InterfaceOne method
	public void show() {
		System.out.println("show Method");
	}
}
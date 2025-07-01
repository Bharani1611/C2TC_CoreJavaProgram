package com.tnif.DayTen.Task.Polymorphism.overriding;

public class rectangle extends shape {
	private double l,b;
	public rectangle (double l,double b)

	{
		this.l=l;
		this.b=b;
	}
	
	@Override
	public void calArea()
	{
		System. out.println ("From Rectangle class:-"+(1*b) );
	}
	
}

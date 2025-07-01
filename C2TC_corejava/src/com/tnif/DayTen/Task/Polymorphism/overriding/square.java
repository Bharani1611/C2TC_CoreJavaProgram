package com.tnif.DayTen.Task.Polymorphism.overriding;

public class square extends shape{
	
	public square(float area)
	{
		super.area=area;
	}
	@Override
	public void calArea()
	{
		System.out.println("From square class:-"
				+super.area*super.area);
	}

}

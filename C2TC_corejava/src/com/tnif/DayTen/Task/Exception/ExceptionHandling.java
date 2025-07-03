package com.tnif.DayTen.Task.Exception;

public class ExceptionHandling{
	public static void main(String args[]) {
		
		try 
		{
			int a[]= {3,1,2,8,2,2,2,4,3,0,0,6};
			System.out.println(a[12]);
			
		}
		
		catch(ArrayIndexOutOfBoundsException Leo) 
		{
			
			System.out.println(" "+Leo.getMessage());
		}
		
		System.out.println("Boom");
		
	}
	
}
		
				
		
		
	
package com.tnif.DayTen.Task.Exception;

public class ExceptionHandling{
	public static void main(String args[]) {
		
		try 
		{
			int a[]= {3,1,2,8,2,2,2,4,3,0,0,6};
			System.out.println(a[5]);
			
		}
		
		catch(ArrayIndexOutOfBoundsException ae) 
		{
			
			System.out.println(" "+ae.getMessage());
		}
		
		System.out.println("next line");
		
	}
	
}
		
				
		
		
	
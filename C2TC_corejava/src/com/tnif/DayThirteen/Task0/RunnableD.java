package com.tnif.DayThirteen.Task0;

public class RunnableD {

	public static void main(String[] args) {
		UsingRunable obj=new UsingRunable(0,5,"Test_Case_Passed..");
		Runnable runnable=new Runnable() {
			
			public void run()
			{
				System.out.println("running to lambda Class");
			}
		};
		Thread thread=new Thread(runnable);
		thread.start();
		
		
       runnable=new Runnable() {
			
			public void run()
			{
				try
				{
					for (int i=1;i<=4;i++)
					{
						System.out.println("Child thread task");
						Thread.sleep(150);
					}
					
				}
				catch(InterruptedException e)
				{
					System.out.println("error");
				}
			}
		};
		thread =new Thread(runnable);
		thread.start();

	}

}

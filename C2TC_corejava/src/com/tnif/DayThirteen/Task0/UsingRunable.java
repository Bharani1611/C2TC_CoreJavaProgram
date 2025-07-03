package com.tnif.DayThirteen.Task0;

public class UsingRunable implements Runnable{
	
	Thread thread;
	int low,high;
	String msg;
	
	public UsingRunable(int low, int high, String msg) {
		super();
		this.low = low;
		this.high = high;
		this.msg = msg;
		thread = new Thread(this,"child");
		thread.start();
		
	}
	@Override
	public void run() {
		
		for (int i=low;i<=high;i++)
		{
			try 
			{
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				System.out.println("Errror:"+e.getMessage());
			}
			System.out.println(msg+" "+i);
		}
	}
}
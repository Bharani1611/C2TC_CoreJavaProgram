package com.tnif.DayFifteen.generics;

public class Sender<T>{
	private T message;
	public Sender(){}
	//Generic Constructor
	public Sender(T message)
	{
		this.message=message;
	}
	//Generic Method
	public void setMessage(T message)
	{
		this.message = message;
	}
	public void sendMessage() 
	{
		System.out.println(message);
	}
}
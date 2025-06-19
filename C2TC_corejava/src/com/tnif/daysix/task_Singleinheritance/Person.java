package com.tnif.daysix.task_Singleinheritance;

public class Person  {
	private int  id;
	private String Name;
	private String city;
	
	
	public Person() {
		this.id=006;
		this.Name="Bharani";
		this.city="Chennai";
		
	}
	
	public Person(int id,String Name, String city)
	{
		this.id=id;
		this.Name=Name;
		this.city=city;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", Name=" + Name + ", city=" + city + "]";
	}
	

}

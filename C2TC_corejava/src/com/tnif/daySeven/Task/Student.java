package com.tnif.daySeven.Task;

public class Student {
	private String sname;
	private static int id;
	private int reg;
	
	static
	{
		System.out.println("static Void Null Executed ");
	}
	
	public Student() {
		id++;
		reg++;
		System.out.println("constructor called..");
		
	}
	
	public int getReg() {
		return reg;
	}


	public void setReg(int reg) {
		this.reg = reg;
	}

	
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	// Static Getter and Setter for ID
	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Student.id = id;
	}

	// toString method
	@Override
    public String toString() {
        return "Student [id=" + id + ", sname=" + sname + ", reg=" + reg + "]";
    }

	
}

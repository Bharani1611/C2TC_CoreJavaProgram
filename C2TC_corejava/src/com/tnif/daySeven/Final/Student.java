package com.tnif.daySeven.Final;

public class Student {
	private String sname;
	private static int id;
	private int reg;
	private final static int MAX_COUNT = 100; // ✅ Corrected with data type and naming convention

	static {
		System.out.println("🌀 static block executed...");
	}

	// Constructor
	public Student() {
		id++;
		reg++;
		System.out.println("🚀 Constructor called...");
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

	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Student.id = id;
	}

	
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", reg=" + reg + "]";
	}
}

package com.tnif.daysix.association.isa;

public class Employe {
	private String name;
	private int employeId;
	private String department;

	// constructors
	public Employe() {
		super();
	}

	public Employe(String name, int employeId, String department) {
		super();
		this.name = name;
		this.employeId = employeId;
		this.department = department;

	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeId;
	}

	public void setEmployeeId(int employeId) {
		this.employeId = employeId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employe [Name=" + name + ", EmployeId=" + employeId + ", Department=" + department + "]";
	}

}

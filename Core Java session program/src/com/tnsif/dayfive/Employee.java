package com.tnsif.dayfive;
//Demo on I-A Association - Inheritance
public class Employee 
{
	private String employeeName;
	private int employeeId;
	private String department;
	
	// Constructor
	public Employee() {
		super();
		
	}
	public Employee(String employeeName, int employeeId, String deprtment) {
		super();
		
		this.employeeName=employeeName;
		this.employeeId = employeeId;
		this.department = department;
		
	}
	// Generate Getters and Setters
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	//override To String Method
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", department=" + department+ "]";
	}
	
	
	
	

}

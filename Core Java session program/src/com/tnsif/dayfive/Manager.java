package com.tnsif.dayfive;
//Child class or derived class

public class Manager extends Employee
{
	private int teamsize;
	
	// Constructor
	public Manager() {
		super();
		
	}
	public Manager(String employeeName, int employeeId, String department)
	{
		super(employeeName,employeeId,department);
	}
	
	//Generate Getters and Setters
	public int getTeamsize() {
		return teamsize;
	}
	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
	@Override
	public String toString() {
		return "Manager [teamsize=" + teamsize + ", getTeamsize()=" + getTeamsize() + ", getEmployeeName()="
				+ getEmployeeName() + ", getEmployeeId()=" + getEmployeeId() + ", getDepartment()=" + getDepartment()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	

}


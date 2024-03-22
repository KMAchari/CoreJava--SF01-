package com.tnsif.dayten;
//Entity is Student
public class StudentArrayDemo {

	private int rollNo;
	private String name;
	
	public StudentArrayDemo (int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		
	}
	public int getRollNo() {
		return rollNo;
		
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
		
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}

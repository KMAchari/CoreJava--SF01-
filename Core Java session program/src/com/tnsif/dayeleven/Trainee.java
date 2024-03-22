package com.tnsif.dayeleven;

public class Trainee {
	String name;
	int uid;
	static String batchNo = "SF01";
	
	public Trainee(String name , int uid ) {
		super();
		this.name = name;
		this.uid = uid;
		
		
	}

	@Override
	public String toString() {
		return "Trainee [name=" + name + ", uid=" + uid + "]";
	}
	

}

package com.tnsif.dayfour;
//Container Class
//Demo on Has-A Association

public class Person 
{
	private String name;
	private Address address;//Injecting object of other class
	
	//Constructor
	public Person() {
		super();
	}
	public Person(String name,Address address) {
		super();
		this.name = name;
		this.address =address;	
		
	}
	// Generate Getters and Setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Name of the Person:"+name);
		System.out.println("Address:"+address.getStreet()+""+address.getCity()+""+address.getState()+""+address.getPostalCode());
	}
	
	

}

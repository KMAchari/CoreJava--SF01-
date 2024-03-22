package com.tnsif.daythree;

public class Encapsulation {
	private int serialNumber;
	private String laptopName;
	private float price;
	
	public int getSerialNumber() 
	{
		return serialNumber;
		
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	

}

package com.tnsif.daysix;

public class OverloadingExecutor {

	public static void main(String[] args) {
		//Methodoverloading m = new MethodOverloading();
		// System.out.println(m.addtion(1234,4321))
		
		System.out.println(MethodOverloading.addition("Kamini","Achari"));
		System.out.println(MethodOverloading.addition(12,354));
		System.out.println(MethodOverloading.addition(12.56f,25.5f));
		System.out.println(MethodOverloading.addition(68.13f,154));
	}

}

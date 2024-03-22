package com.tnsif.dayeight;

public class StringDemo {

	public static void main(String[] args) {
		
		String str = new String("Kamini"); //Way 1
		System.out.println(str);
		String str2 = "Achari";//Way 2
		System.out.println(str2);
		
		String s1 = new String("Hello"); // 2 objicts i.e 1 in heap and 1 in String pool
		String s2 = new String("Hello"); // 1 Object in heap and np duplicates in string pool
		String s3 ="Hello";// 0 Objects no duplicate
		String s4 ="Hello"; // 0 Objects no duplicate
		
		System.out.println(s1);	
		System.out.println(s2);	
		System.out.println(s3);	
		System.out.println(s4);	
		
		
		

	}

}

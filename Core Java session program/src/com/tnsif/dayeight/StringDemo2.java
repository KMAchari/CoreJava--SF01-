package com.tnsif.dayeight;

public class StringDemo2 {

	public static void main(String[] args) 
	{
		String s = new String("Kamini");
		// .concat("Achari"); Immutable Strng Objects
		String s2 = s.concat("Achari");
		System.out.print(s2);
		// String and StringBuffer
		// both are opposite of each other 
		//String objects are immutabe(Cannot be changed)
		//String buffer objects are mutable in nature
		
		StringBuffer s1 = new StringBuffer("Kamini");
		s1.append("Achari");
		System.out.println(s);
		
		System.out.println(s.length());
		//Length() method is used with string 
		// length variable is used with arrays.
		
		String I = s.toLowerCase();
		String u = s.toUpperCase();
		
		System.out.println(I);
		System.out.println(u);
	}

	
}

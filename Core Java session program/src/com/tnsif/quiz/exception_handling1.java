package com.tnsif.quiz;

public class exception_handling1 {
	public static void main(String args[]) {
		
		try 
		{
			System.out.println("Hello"+" "+1/0);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("world");
			
		}
	}

}

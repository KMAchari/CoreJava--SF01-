package com.tnsif.quiz;

public class exception_handling3 {

	public static void main(String[] args) 
	{
	 
		try {
			int a, b;
			b= 0;
			a= 5/b;
			System.out.print("A");
			
		}
		catch(ArithmeticException e)
		{
			System.out.print("B");
		}

	}

}

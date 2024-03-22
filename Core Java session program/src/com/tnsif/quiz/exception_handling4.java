package com.tnsif.quiz;

public class exception_handling4 {

	public static void main(String[] args)
	{
		
		try {
			throw new NullPointerException ("Hello");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("B");
		}
	}

}

package com.tnsif.day12;

public class ExceptionDemo {

	public static void main(String[] args) {
		int arr[];
		
		try// one try  block- nested try is  allowed
		{
			arr = new int[] {10,20,30,40,50};
			System.out.println(arr[6]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)// many catch blocks are allowed
		{
			System.err.println("Specified index does not exist"+e.getMessage());
			
		}
		finally
		{
			System.out.println("Hey I am Finally!!!");
			
		}
		

	}

}

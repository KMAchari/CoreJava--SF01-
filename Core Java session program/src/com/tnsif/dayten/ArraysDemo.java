package com.tnsif.dayten;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) 
	{
		int intArr[]= {10,23,45,87,456,90,0,12,34,71,33};
		
		System.out.println("Before Sorting"+Arrays.toString(intArr));
		
		Arrays.sort(intArr);
		
		System.out.println("After Sorting"+Arrays.toString(intArr) );
		
		
		
		
	}

}

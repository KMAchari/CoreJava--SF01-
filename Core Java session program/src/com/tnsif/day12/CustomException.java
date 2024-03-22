package com.tnsif.day12;
import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		
		
		int age;
		System.out.println("Enter the age =");
		
		Scanner s= new Scanner(System.in);
		age = s.nextInt();
		
		if(age<18)
		{
			throw new CantVote("You Cannot vast a vote as you are underage..");
		}
		else
		{
			System.out.println("You can happily cast a vote..");
			
		}
		
	}

}

class CantVote extends RuntimeException // throwable--printStackTrace()
   {
	public CantVote(String msg) {
		super(msg);
	}
	
	
}

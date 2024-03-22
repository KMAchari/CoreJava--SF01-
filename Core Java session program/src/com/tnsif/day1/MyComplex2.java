package com.tnsif.day1;

import java.util.Scanner;

public class MyComplex2
{
  double real;
  double imaginary ;
  
  MyComplex2()
{
	  real=0;
	  imaginary=0;
}
  MyComplex2(double r , double imag)
  {
	  real = r;
	  imaginary= imag;
	  
  }
  void addition(MyComplex2 C2)
  {
	   double realad= this.real +C2.real;
	   double imagad= this.imaginary +C2.imaginary;
	   
	   System.out.println("\n Addition of 2 complex number =" +realad+ "+" +imagad+ "i\n");
	   
	   
  }
  
  void substraction(MyComplex2 C2)
  
  {
	  double realad = this. real-C2.real;
	  double imagad = this.imaginary -C2.imaginary;
	  
	  System.out.println(" Substraction of 2 complex number = "+realad+ "+" +imagad+ "i \n");
			 
	  
  }
void multiplication(MyComplex2 C2)
  
  {
	  System.out.println("Multiplication Code to be  written ......");
	  
			 
	  
  }
void Division(MyComplex2 C2)

{
	  System.out.println("Division Code to be  written ......");
	  
}

public static void main(String[] args) {
	
	char choice = 'y';
	int option =0;
	
	MyComplex2 C1 = new MyComplex2(1,2);
	MyComplex2 C2 = new MyComplex2(3,4);
	MyComplex2 C3 = new MyComplex2();
	
	Scanner sc = new Scanner(System.in);
	
	while(choice=='y' || choice =='Y') {
		
		System.out.println(" \n\n*** Menu for Complex number Arithmatic***");
		System.out.println("1. Add");
		System.out.println("2. Sub");
		System.out.println("1. Mul");
		System.out.println("1. Div");
		System.out.println("1. Exit");
		
		System.out.println("Enter  your Choice from the list");
		option = sc.nextInt();
		
		switch(option)
		{
		case 1: C1.addition(C2);
		     break;
		case 2: C1.substraction(C2);
		     break;
		case 3: C1.multiplication(C2);
		     break;
		     
		case 4: C1.Division(C2);
		break;				         
		}
		
		System.out.println("\n Do you want to continue (y/n) ???");
		choice = sc.next().charAt(0);
		
	}
	
	System.out.println("\n\n\n Thank You ..... program ended");
	
	
	
}
}

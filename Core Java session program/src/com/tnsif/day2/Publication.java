package com.tnsif.day2;

import java.util.Scanner;

class Publication
{
	String title ;
	double price;
	int copies;
	
	public Publication()
	{
		title="";
		price = 0.0;
		copies=0;
		
		
	}
	public void saleCopy() {
		System.out.println("\n Seperate Sale for Book and Magazine");
		
	}
	public int get_copies() 
	{
		return copies;
	}
	public void input() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter Title :");
		title = sc.nextLine();
	    System.out.println("\n Enter Price :");
	    price = sc.nextDouble();
	    System.out.println("\n Enter Copies :");
	    copies = sc.nextInt();      	
	}
	public void display() {
		System.out.println("\n Enter Title :"  +title);
		System.out.println("\n Enter Price :"  +price);
		System.out.println("\n Enter Copies :" +copies);
		
		
		
		
	}
	

}
class Book1 extends Publication 
{
	String author ;
	public Book1() {
		super();
		author="";
		
		
	}
	@Override 
	public void saleCopy() 
	{
		double total_sale=0;
		total_sale=price*copies;
		System.out.println("\n Total Sale Copy For Book :");
		display_book();
		System.out.println("\n Total Sale For:"+author+"is"+total_sale);
		
		
		
	}
	
	public void orderCopies() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n How Many copies of book you want to order ?");
		n=sc.nextInt();
		copies = copies+n;
	}
	public void inputbook() {
		input();
		System.out.println("\n Enter Book Author : ");
		Scanner sc = new Scanner(System.in);
		author =sc.nextLine();
		
	}
	public void display_book() 
	{
		display();
		System.out.println("\n Book author :"+author);
		
		
	}
	
	
}
class Magzine extends Publication
{
	int issue;
	public Magzine()
	{
		super();
		issue=0;
		
	}
	@Override
	public void saleCopy() {
		double total_sale=0;
		total_sale=price*copies;
		System.out.println("\n Total Sale Copy For Book :");
		display();
		System.out.println("\n Total Sale For:"+issue+"is"+total_sale);
		
	}
	public void input_mag() {
		input();
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter Magzine Issue: : ");
		issue =sc.nextInt();
		
		
	}
	public void orderQty() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Quantity of Magzine you want to order ?");
		n=sc.nextInt();
		copies = copies+n;
	}
	public int receiveissue()
	{
		return issue;
		
	}
	public void disply_mag() {
		display();
		System.out.println("\n Magzine Issue:"+issue);
		
	}
}
class Book
{
	public static void main(String args[]) 
	{
		Book1  b1 = new Book1();
		Magzine m1=new Magzine();
		Publication p1 = new Publication();
		
		System.out.println("\n.......Book Data....");
		   b1.inputbook();
		   b1.display_book();
		   b1.orderCopies();
		   
		   p1=b1;
		   p1.saleCopy();
		   System.out.println("\n Total Copies Sold:" +p1.get_copies());
		   
		   System.out.println("\n ***** Magzine Data *****");
		   p1 = new Magzine();
		   m1.input_mag();
		   m1.disply_mag();
		   m1.orderQty();
		   
		   p1=m1;
		   p1.saleCopy();
   
		   System.out.println("\n Above Information is for Issue:" +m1.receiveissue());
		   
		   
		
	}
}

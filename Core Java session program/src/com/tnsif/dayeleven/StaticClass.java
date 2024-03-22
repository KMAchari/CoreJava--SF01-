package com.tnsif.dayeleven;

public class StaticClass {
	private static int b =1;
	private static String s ="TNSIF";
	
	public static class StaticInner
	{
		public void display() {
			System.out.println("Batch :"  +b);
			System.out.println("Name :" +s);
			
		}
	}
	public static void main(String[] args) {
		
		StaticClass.StaticInner in = new StaticClass.StaticInner();
		
		in.display();
	}

}

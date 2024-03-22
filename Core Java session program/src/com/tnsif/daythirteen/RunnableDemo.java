package com.tnsif.daythirteen;

public class RunnableDemo {

	public static void main(String[] args) {
		
		
		UsingRunnableInterface ur = new UsingRunnableInterface(10,20,"Hello");
		
		Runnable runnable= new Runnable() 
		{
			public void run() 
			{
				System.out.println("Runnable with help of Anonymous class");
			}
			//Anonymous
		};
		
	}

}

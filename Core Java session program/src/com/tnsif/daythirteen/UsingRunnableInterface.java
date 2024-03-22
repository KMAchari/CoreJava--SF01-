package com.tnsif.daythirteen;
//Demo on how to create  thread using Runnable Interface
public class UsingRunnableInterface implements Runnable 
{
	
	Thread t;//reference variable
	int l,h;
	String msg ;
	
    public UsingRunnableInterface(int l, int h , String msg) {
    	this.l =l;
    	this.h =h;
    	this.msg = msg;
    	t=new Thread(this,"Child Thread");
    	t.start();
    	
    }

	@Override
	public void run() {
		
		for(int i=l;i<=h;i++) {
			try {
				Thread.sleep(3000);
				
			} catch(InterruptedException e) {
				
				System.out.println(e.getMessage());
				
			}
			System.out.println(msg+i);
		}
		
		
	}

}

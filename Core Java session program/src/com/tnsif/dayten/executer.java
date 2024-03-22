package com.tnsif.dayten;

public class executer {
	
	public static void main (String [] args) {
		StudentArrayDemo arr[]; // array declaration
		arr = new StudentArrayDemo [5]; // array creation 
		
		arr[0]=new StudentArrayDemo(101, "Kamini");
		arr[1]=new StudentArrayDemo(102, "Mayuri");
		arr[2]=new StudentArrayDemo(103, "Suchita");
		arr[3]=new StudentArrayDemo(104, "Unnati");
		arr[4]=new StudentArrayDemo(105, "Sakshi");
		
		for(int i =0;i<arr.length;i++)
		{
			System.out.println("Student Array Elements:" +i+ ":"+arr[i].getRollNo()+" "+arr[i].getName());
		}
		
		
	}
	

}

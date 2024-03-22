package com.tnsif.dayfourteen;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String, Integer> courses=new TreeMap<String ,Integer>();
		courses.put("Python", 40);
		courses.put("C", 44);
		courses.put("C++", 33);
		courses.put("Java", 55);
		courses.put("Perl", 10);
		System.out.println(courses);
		
		//Student-key    //String -Value
		
		TreeMap<Student,String> students = new TreeMap<Student,String>();
		students.put(new Student (1,"Kamini",70f),"FY");
		students.put(new Student (2,"Vanshika",70f),"TY");
		students.put(new Student (3,"Divya",70f),"SY");
		students.put(new Student (4,"Surbhi",70f),"FY");
		students.put(new Student (5,"Riyanshi",70f),"FY");
		System.out.println(students);
		
		
		

	}

}

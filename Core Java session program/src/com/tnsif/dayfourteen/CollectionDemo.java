package com.tnsif.dayfourteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.lang.String;

public class CollectionDemo {

	public static void main(String[] args)
	{
		//Generics
		
		ArrayList <Integer> list = new ArrayList<Integer>();
		list.add(1000);
		list.add(110);
		list.add(1110);
		list.add(111110);
		list.add(11101);
		System.out.println(list);
		
		for (int elements:list)
		{
			System.out.println(elements);
		}
		// Collection Framework ..... Collections Class
		
		Collections.sort(list);
		System.out.println("Sorted List Asc :"+list);
		//Reverse
		Collections.reverse(list);
		System.out.println("Sorted List Dsc :"+list);
		
		//Lambda expression
		Comparator<Integer> comp=(n1,n2)->n2-n1;
		Collections.sort(list, comp);
		System.out.println("Sorted List Dsc :"+ list);
		
		// user Defined object -- Generics
		ArrayList<Student>studentList = new ArrayList<Student>();
		Student s1 = new Student(105, "Kamini",4.5f);
		studentList.add(s1);
		Student s2 = new Student(104, "Myuri",7.5f);
		studentList.add(s2);
		Student s3 = new Student(103, "Chitra",5.5f);
		studentList.add(s3);
		Student s4 = new Student(102, "Ankita",4.5f);
		studentList.add(s4);
		Student s5 = new Student(101, "Rekha",4.5f);
		studentList.add(s5);
		System.out.println(studentList);
		
		
		// sorting on per criteria
		Comparator<Student> comp1= (st1,st2)->(int)(st1.getPer()-st2.getPer());
		Collections.sort(studentList,comp1);
		System.out.println(studentList);
		
		// sorting on name criteria
		
		/*Comparator<Student> comp2= (st1,st2)->(st1.getName()-st2.getName());
		Collections.sort(studentList,comp2);
		System.out.println(studentList);*/
		
		// Sorting on roll no criteria
		Comparator<Student> comp3= (st1,st2)->(int)(st1.getRollNo()-st2.getRollNo());
		Collections.sort(studentList,comp3);
		System.out.println(studentList);
		

	}

}

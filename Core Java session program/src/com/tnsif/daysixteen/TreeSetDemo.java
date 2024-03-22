//TreeSet Program
package com.tnsif.daysixteen;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args)
	{
		TreeSet <String>Courses = new TreeSet<String>();//ascending order-ordered ? Yes
		
		Courses.add("Python");
		Courses.add("Java");
		Courses.add("C");
		Courses.add("C++");
		Courses.add("Pearl");
		Courses.add("Java Script");
       // t.add(90);
        //t.add(45.0);
       // t.add(null);//Use HashSet
        System.out.println(Courses);
        
        //TreeSet in order to hold user defined objects
        TreeSet<Student>students = new TreeSet<Student>();
        students.add(new Student(111,"Suchita",89.0f));
        students.add(new Student(123,"Alka",99.0f));
        students.add(new Student(114,"Kritika",70.0f));
        students.add(new Student(144,"Shilpa",77.0f));
        students.add(new Student(155,"Divya",56.0f));
        System.out.println(students);
        
        

	}

}

package com.tnsif.dayfifteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		List<Employee> employees= new ArrayList<Employee>();
		employees.add(new Employee(111,"Kamini",60000.0));
		employees.add(new Employee(222,"Ragini",70000.0));
		employees.add(new Employee(333,"Komal",80000.0));
		employees.add(new Employee(444,"Vanita",90000.0));
		employees.add(new Employee(555,"Nisha",50000.0));
		
		System.out.println("Original List");
		employees.forEach(System.out::println);
		
		Collections.sort(employees);
		
		System.out.println("Sorted List on the basis of IDs:");
		employees.forEach(System.out::println);
		
		Collections.sort(employees,new EmployeeSalaryComprator());
		System.out.println("Sorted List on the basis of Salary");
		employees.forEach(System.out::println);
		
		
	}

}

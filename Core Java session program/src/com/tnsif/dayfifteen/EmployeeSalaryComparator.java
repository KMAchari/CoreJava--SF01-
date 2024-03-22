package com.tnsif.dayfifteen;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.compare(e1.getSalary(),e2.getSalary());
	}

	

}

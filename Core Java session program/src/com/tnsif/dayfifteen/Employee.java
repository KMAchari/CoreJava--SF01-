package com.tnsif.dayfifteen;
//Entity
public class Employee implements Comparable<Employee>
{
	public static final String Double = null;
	private int id ;
	private String name;
	private double salary;
	public int getId() {
		return id;		
	}
	public void setId(int id) {
		this.id =id;
		
	}
	public String getName()
	{
		return name;
		
	}
	public void setName(String Name) {
		this.name = name;
		
	}
	public double getSalary() {
		return salary;
		
	}
	public void setSalary(double salary) {
		this.salary = salary;
		
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary=salary;
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" +salary+ "]";
		
	}
	@Override
	public int compareTo(Employee otherEmployee) {
		return Integer.compare(this.id, otherEmployee.id);
		
	}
	public int compare(double salary2, double salary3) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
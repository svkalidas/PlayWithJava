package com.ksv.study;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Employee{
	String id;
	String name;
	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "id = "+this.id+ " name = "+this.name;
	}
	
	@Override
	public int hashCode() {
		return this.id.hashCode()+this.name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e1 = (Employee)obj;
		return this.id.equals(e1.id) && this.name.equals(e1.name);
	}
}

public class DuplicateCheck {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		Employee e1 = new Employee("101", "Kalidas");
		Employee e2 = new Employee("101", "Kalidas");
		Employee e3 = new Employee("102", "Vishnu Raj");
		Employee e4 = new Employee("103", "Aswathy");
		Employee e5 = new Employee("104", "Annie");
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		printDuplicates(employees);
	}
	
	private static void printDuplicates(List<Employee> employees) {
		
		if(employees != null && !employees.isEmpty()) {
			
			Set<Employee> checkList = new HashSet<>();
			
			employees.forEach(emp ->{
				System.out.println(emp.hashCode());
				if(!checkList.add(emp)) {
					System.out.println("Duplicate : "+emp.toString());
				}
			});
			
			System.out.println(checkList);
		}
	}
}

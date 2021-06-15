package com.ksv.java11;

import java.util.Arrays;
import java.util.List;

public class CollectoinToArrayTest {


	private static class Employee {
		String name;
		int id;
		
		public Employee(String name, int id) {
			this.name = name;
			this.id = id;
		}
		
		@Override
		public String toString() {
			return "Name : "+this.name + " Id : "+this.id;
		}
	}
	
	public static void main(String[] args) {
		
		Employee[] emp = {new Employee("Alex", 1)};
		
		Employee[] emp1 =  new Employee[10];
		
		Employee[] emp2 = new Employee[] {new Employee("Jhon",1)};
		
		List<Employee> empList = Arrays.asList(new Employee("Abin",1),new Employee("Alex", 2), new Employee("Jose",3));
		
		List<String> testList = Arrays.asList("abc", "efg", "hij", "klmn");
		
		System.out.println(testList.toArray());
		System.out.println(testList.toArray(String[]::new));
		
		Employee[] array = empList.toArray(emp1);
		
		Employee[] array2 = empList.toArray(Employee[]::new);
	}
}

package com.ksv.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ksv.functionalPrograming.Employee;

public class StreamTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "George", "Dev", 2000);
		Employee emp2 = new Employee(2, "Alex", "Mg", 1000);
		Employee emp3 = new Employee(3, "Jhon", "Dev", 5000);
		Employee emp4 = new Employee(4, "Manual", "Test", 6000);
		Employee emp5 = new Employee(5, "Arun", "PMO", 4000);
		Employee emp6 = new Employee(6, "Ben", "Dev", 2000);
		Employee emp7 = new Employee(7, "Sonia", "PMO", 8000);
		Employee emp8 = new Employee(8, "Lissi", "Dev", 6500);
		Employee emp9 = new Employee(9, "Elina", "Test", 7000);
		Employee emp10 = new Employee(10, "Bosko", "Test", 3000);

		List<Employee> empList = Arrays
				.asList(new Employee[] { emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10 });
		// Print the name of the employees with salary grater than 2k in alphabetic
		// order
		empList.stream().filter(e -> e.getSalary() > 2000).map(Employee::getName).sorted().forEach(System.out::println);

		// get the map with employees having same salary using collectors

		Map<Integer, List<Employee>> salaryMap = empList.stream().collect(Collectors.groupingBy(Employee::getSalary));

		System.out.println(salaryMap);
	
		// collected the stream as map of salary and employee without using collectors 
		empList.stream().collect(HashMap<Integer, Employee>::new, (m,t) -> m.put(t.getSalary(),t) , (m1,m2)->m1.putAll(m2)).forEach((k,v)-> System.out.println(k+" : "+v.getName()));
		
		// collected the stream as map of salary and employee without using collectors.toMap
		empList.stream().collect(Collectors.toMap(Employee::getName, (t)->t)).forEach((k,v)-> System.out.println(k +" : "+v.getSalary()));

		Employee employee1 = empList.stream().min((a,b)-> a.getSalary().compareTo(b.getSalary())).get();

		System.out.println(employee1.getName());
		
		Employee employee3 = empList.stream().max((a,b)-> a.getSalary().compareTo(b.getSalary())).get();

		System.out.println(employee3.getName());

		Employee employee2 = empList.stream().reduce((a, b) -> a.getSalary() > b.getSalary() ? a : b).get();

		System.out.println(employee2.getName());
	}
}

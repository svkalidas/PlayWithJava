package com.ksv.functionalPrograming;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;


public class MethodReference {

	public static void main(String[] args) {
		Employee emp = new Employee(01, "Frank", "PMO", 3000);
		
		Supplier<Integer> s1 = emp::getSalary;
		
		Supplier<Employee> empSupplier = Employee::new;
		
		System.out.println(s1.get());
		
		emp.setSalary(300);
		
		System.out.println(s1.get());
		
		EmployeeTest empSup = Employee::new;
		
		Function<Employee,Integer> f1 = Employee::getSalary;
		
		Consumer<String> stringC = String::length;
		
		Consumer<Employee> employeeC = Employee::getSalary;
		
		Function<String, Integer> s2 = String::length;
		
		System.out.println(s1.get());
		
		Consumer<Integer> c1 = emp::setSalary;
		
		c1.accept(4000);
		
		UnaryOperator<Employee> u1 = emp::update;
		
		u1.apply(emp);
		
		System.out.println(emp.getSalary());
		
		BiConsumer<Employee, Integer> c2 = Employee::setSalary;
		
		c2.accept(emp, 3000);
		//The above expression can also be write as follows 
		BiConsumer<Employee, Integer> c3 = (e,s)-> e.setSalary(s);
		
		Consumer<String> c4 = String::length;
		
		//Static method of an interface
		String result = FunctionalInterfaceTest.updateResult("");
		
		FunctionalInterfaceTest functionTest = ()-> "-Ve";
		
		//Default metod of an interface 
		functionTest.setResult("+ve");
		
		//implemented via lambda expression
		functionTest.getResult();
	}
	
	@FunctionalInterface
	private static interface EmployeeTest {
		abstract Employee getEmployee(Integer empId, String name, String department, Integer salary);
	}
}

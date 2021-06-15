package com.ksv.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
class Employee1 implements Comparable<Employee1>,Comparator<Employee1>{
	String name;
	Double salary;
	
	public Employee1(){
		
	}
	
	public Employee1(String name, Double salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String toString(){
		return "Employee Name: "+this.name+" Salary : "+salary;
		
	}
	@Override
	public int compareTo(Employee1 emp){
		return this.name.compareTo(emp.name);
	}
	
	public int compare(Employee1 e1, Employee1 e2){
		return e1.salary.compareTo(e2.salary);
	}
}

public class ComparableAndComparator {

	public static void main(String[] args) {
		Integer[] a = new Integer[]{3,2,5,1,8,6};
		List<Integer> l1 = new ArrayList<>();
		List<Character> l2 = new ArrayList<>();
		l2.add('f');
		l2.add('g');
		l2.add('q');
		l2.add('z');
		for(int i=0; i<5;i++){
			l1.add(4-i);
		}
		Arrays.sort(a);
		Collections.sort(l1);
		Collections.sort(l2);
		
		System.out.println(Arrays.toString(a));
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		Comparator<Integer> descendingOrder = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2){
				return o2.compareTo(o1);
			}
		};
		
		Arrays.sort(a, descendingOrder);
		Collections.sort(l1,descendingOrder);
		System.out.println(Arrays.toString(a));
		System.out.println(l1.toString());
		
		
		//Sorting of collection of Custom object
		
		Employee1 e1 = new Employee1("Kalidas", 40000.0);
		Employee1 e2 = new Employee1("Sajan", 30000.0);
		Employee1 e3 = new Employee1("Siril", 60000.0);
		Employee1 e4 = new Employee1("Alax", 20000.0);
		
		Employee1[] eArray = {e1,e2,e3,e4};
		List<Employee1> eList = new ArrayList<>();
		eList.add(e1);
		eList.add(e2);
		eList.add(e3);
		eList.add(e4);
		
		Arrays.sort(eArray);
		Collections.sort(eList);
		System.out.println(Arrays.toString(eArray));
		System.out.println(eList.toString());
		System.out.println("-------------------");
		Arrays.sort(eArray, new Employee1());
		Collections.sort(eList, new Employee1());
		
		System.out.println(Arrays.toString(eArray));
		System.out.println(eList.toString());
		
	}
}

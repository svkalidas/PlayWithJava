package com.ksv.study;

import java.util.Arrays;

public class GenericsInheritance<T> {
	
	T name;
	T[] nameArray;
	public GenericsInheritance() {
		// TODO Auto-generated constructor stub
	}
	public GenericsInheritance(T[] nameArray) {
		this.nameArray = nameArray;
	}
	public T get(){
		return name;
	}
	
	public static void main(String[] args) {
		String[] nameArray = {"KSV"};
		GenericsInheritance<String> g1 = new GenericsInheritance<>(nameArray);
		GenericsInheritance<Object> g2 = new GenericsInheritance<>();
		g1.name = "KSV";
		//g1.nameArray = {"KSV","DSV"};
		System.out.println(Arrays.toString(g1.nameArray));
		//g2 = g1; // Will show compile time error because g1's generic type is String, but g2's is Object
		
	}

}

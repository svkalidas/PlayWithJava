package com.ksv.inheritence;

import java.util.List;

public class Child2 extends Child1{

	public static void main(String[] args) {
		
		Parent1 parent = new Child2();
		if(parent.getClass().isAssignableFrom(Parent1.class)) {
			System.out.println(String.format("this is assignableFrom"));
		}
		
		if(parent instanceof Child1) {
			System.out.println(String.format("this is instanceof"));
		}
		
		List<String> testList = null;
		// Will throw null pointer exception
		for(String test : testList) {
			System.out.println(test);
		}
	}
}

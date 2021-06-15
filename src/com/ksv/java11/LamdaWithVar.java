package com.ksv.java11;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LamdaWithVar {

	public static void main(String[] args) {
		var test = "String";

		var testList = Arrays.asList("Java", "Java Script", "Python");
		
		var testList1 = new LinkedList<>(testList);
		
		Iterator<String> iterator = testList1.iterator();
		
		while(iterator.hasNext()) {
			String next = iterator.next();
			if(next == "Python") {
				iterator.remove();
			}
		}
		
		iterator = testList1.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(testList);

		testList.forEach((var x) -> System.out.println(x.toUpperCase()));
		

	}
}

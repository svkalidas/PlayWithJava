package com.ksv.study;

import java.util.ArrayList;
import java.util.List;

public class ForEachTest {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.forEach(data -> System.err.println(data));
		
		System.out.println("success");
		
		Object l0 = null;
		try {
			LogicalProblem1 l1 = (LogicalProblem1) l0;
			System.out.println(l1 != null?l1.toString():"null");
		} catch (Exception e) {
			System.out.println("null pointer exception");
		}
	}
}

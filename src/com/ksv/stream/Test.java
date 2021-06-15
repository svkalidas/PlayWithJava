package com.ksv.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.IntStream;

import com.ksv.collection.Child;

public class Test {

	public static void main(String[] args) {
		IntStream.range(0, 10).sorted();
		
		int myvalue = 0;
		
		Test myTest = new Test();
		
		List<Child> test = new ArrayList<>();
		
		test.stream().skip(10).map(c -> c.getId()).distinct().count();
		
		Test test1 = new Test();
		//an object on which the method is invoked is, in fact, the implicit first argument of a method
		test1.processInfo(test1::getInfo);
		
		test.forEach(c -> test1.incrementMyvalue(myTest));
		
		Map<String, Integer> testMap = new HashMap<>();
		
		testMap.computeIfAbsent("KKSV", Test::inputLength);
		
		Map<String, Integer> nameMap = new HashMap<>();
		Integer value = nameMap.computeIfAbsent("John", s -> s.length());
		
		Integer value1 = nameMap.computeIfAbsent("John", String::length);
	}
	
	private void incrementMyvalue(Test i) {
		i.getClass();
	}
	
	public String getInfo(Test t) {
		return "Hello";
	}
	
	private <R>void processInfo(Function<Test, R> info) {
		Test t = null;
		System.out.println(info.apply(t));
	}
	
	public static int inputLength(String input) {
		return input.length();
	}
}

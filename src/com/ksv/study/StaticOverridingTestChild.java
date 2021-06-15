package com.ksv.study;

public class StaticOverridingTestChild extends StaticOverridingTest{
	
	public static void test() {
		System.out.println("Test from the child");
	}

	public static void main(String[] args) {
		
		test();
		StaticOverridingTestChild.test();
		StaticOverridingTest.test();
		
		StaticOverridingTest test = new StaticOverridingTestChild();
		
		test.test();
	}
}

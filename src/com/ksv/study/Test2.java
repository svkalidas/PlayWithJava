package com.ksv.study;

public class Test2 extends Test1 implements Test3{

	@Override
	public String getName(){
		return "Hello";
	}
	
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		System.out.println(t2.getName());
		System.out.println(t2.getAddress());
	}

}

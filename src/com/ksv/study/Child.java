package com.ksv.study;

public class Child extends Parent{

	@Override
	String getName() {
		return "Samual";
	}
	
	public static void main(String[] args) {
		String a = "xyz";
		String b = new String("xyz");
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}
}

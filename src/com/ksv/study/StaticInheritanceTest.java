package com.ksv.study;

class StaticInheritanceTest1{
	public static String getName(){
		return "KKSV1";
	}
	
	public String getUserName(){
		return "svKalidas1@gmail.com";
	}
}

public class StaticInheritanceTest extends StaticInheritanceTest1{

	public static String getName(){
		return "KKSV";
	}
	
	public String getUserName(){
		return "svKalidas@gmail.com";
	}
	
	public static void main(String[] args) {
		
		StaticInheritanceTest1 t1 = new StaticInheritanceTest();
		
		System.out.println(t1.getUserName());
		System.out.println(t1.getName());
	}
}

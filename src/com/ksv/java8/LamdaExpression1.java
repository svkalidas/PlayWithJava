package com.ksv.java8;


public class LamdaExpression1 {

	String greetingMessage = "All the best ";
	interface Greeting{
		String greetingMessage(String message);
	}
	
	Greeting greeting = message -> greetingMessage = greetingMessage+message;
	
	public static void main(String[] args) {
		
		LamdaExpression1 lamdaExpression = new LamdaExpression1();
		System.out.println(lamdaExpression.greetingMessage);
		System.out.println(lamdaExpression.greeting.greetingMessage("Rahul"));
		System.out.println(lamdaExpression.greetingMessage);
	}
}

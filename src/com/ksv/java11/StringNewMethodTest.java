package com.ksv.java11;

public class StringNewMethodTest {

	
	public static void main(String[] args) {
		
		String test = " Hello everyone \n welcome to java world \n \n explore java";
		
		//isBlank method
		String testBlank = "";
		String testBlank2 = " ";
		System.out.println("----isBlant Test----");
		System.out.println( test.isBlank());
		System.out.println(testBlank.isBlank());
		System.out.println(testBlank2.isBlank());
		
		System.out.println("----isEmpty Test----");
		System.out.println(testBlank.isEmpty());
		System.out.println(testBlank2.isEmpty());
		
		//lines : return the stream of string
		System.out.println("----lines----");
		long count = test.lines().count();
		System.out.println(count);
		
		//Strip : produce the same result as trim() (Remove space from both the end of the string)
		System.out.println("----strip----");
		System.out.println(test.strip());
		System.out.println(test.trim());
		
		//StripLeading : removing the empty space from the leading end of the string
		System.out.println("----StripLeading----");
		System.out.println(test.stripLeading());
		
		//StripTrailing : remove the empty space from the trailing edge of the string
		System.out.println("----StrignTraiing----");
		System.out.println(test.stripTrailing());
		
		//Repeat
		System.out.println("----Repeat----");
		System.out.println(test.repeat(2));
	}
}

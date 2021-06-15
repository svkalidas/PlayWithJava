package com.ksv.study;

import java.util.function.Function;

import org.apache.commons.lang3.StringUtils;

class UtilFuntions{
	
	static String getFirstIntex(String input) {
		return StringUtils.isEmpty(input)?"Invalid input":String.valueOf(input.charAt(0));
	}
	
}
public class FunctionalProgramming {
	
	public static void main(String[] args) {
		String input = "KKSV";
		Byte d = new Byte("1");
		int g = d;
		System.out.println(g);
		Function<String, String> f = j -> j+" Welcome";
		System.out.println(f.apply(input));
		
		Function<String, String> k = UtilFuntions::getFirstIntex;
		
		k = k.andThen(j-> j+" Welcome to the world of coding");
		taskPerformer(input, UtilFuntions::getFirstIntex);
		taskPerformer(input, k);
		taskPerformer(input, f);
	}
	
	
	private static void taskPerformer(String input, Function<String, String> task) {
		System.out.println(task.apply(input));
	}
}

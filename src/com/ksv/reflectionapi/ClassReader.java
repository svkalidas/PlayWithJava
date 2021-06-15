package com.ksv.reflectionapi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ClassReader {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		String className = scan.nextLine();
		
		String a = "345+345+";
		Pattern p = Pattern.compile("[+]");
		a = a.replaceAll("[+]", "");
		System.out.println(a);

		ClassReader reader = ClassReader.class.getConstructor().newInstance();

		reader.readClassDetails(className);
	}

	private void readClassDetails(String className) throws Exception {

		try {
			Class<?> inputClass = Class.forName(className);
			readConstructors(inputClass);

		} catch (ClassNotFoundException e) {
			System.out.println("Please enter a valid input");
		}
	}

	private void readConstructors(Class<?> inputClass) throws Exception {

		Constructor<?>[] constructors = inputClass.getConstructors();

		for (Constructor<?> c : constructors) {
			Parameter[] parameters = c.getParameters();
			if (parameters.length > 0) {
				Object newInstance = c.newInstance(parameters);
				System.out.println("Object created for " + inputClass.getName() + " with constructor : " + c.getName());
			} else {
				Object newInstance = c.newInstance();
			}
		}
	}

}

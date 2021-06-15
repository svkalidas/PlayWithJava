package com.ksv.study;

import java.util.Scanner;

public class FibonacciCalculator {

	static int start = 0;
	static int next = 1;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter count");
		int count = scanner.nextInt();
		scanner.close();
		for(int i = 1;i<=count;i++) {
			System.out.println(fibonacci(i));
		}
		
	}
	
	private static int fibonacci(int count) {
		if(count == 1) {
			return 0;
		}else if(count == 2 || count == 3) {
			return 1;
		}
		return fibonacci(count - 2)+fibonacci(count - 1);
	}
	
	
}

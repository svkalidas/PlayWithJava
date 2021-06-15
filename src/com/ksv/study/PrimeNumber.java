package com.ksv.study;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		System.out.print(Math.pow(12,3));
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter up to which number you have to find the prime numbers");
		int input = scan.nextInt();
		findPrimeNumbers(input);
	}

	static void findPrimeNumbers(int input) {
		int count = 0;
		if(input < 0) {
			System.out.println("Enter a valid number");
		}else {
			for(int i =1; i<=input;i++) {
				if(isPrimeNumber(i)) {
					System.out.println(i);
					count++;
				}
			}
		}
		System.out.println("Total number of prime numbers are :"+count);
	}
	
	static boolean isPrimeNumber(int input) {
		if(input == 0 || input == 1) {
			return false;
		}
		if(input == 2 || input ==3) {
			return true;
		}else {
			if(input % 2 == 0) {
				return false;
			}else {
				int sqr = (int)Math.sqrt(input);
				for(int i = 3; i <=sqr ; i+=2) {
					if(input%i == 0) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
}

package com.ksv.codingChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import org.apache.commons.lang3.StringUtils;

interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation1 p, int num) {
		return p.check(num);
	}

	public static PerformOperation1 isOdd(){
        return (int a) -> a % 2 != 0;
    }

	public PerformOperation1 isPrime() {
		return a -> {

			if (a < 2)
				return false;
			if (a == 2 || a == 3)
				return true;
			for (int i = 2; i < a / 2; i++) {
				if (a % i == 0)
					return false;
			}
			return true;
		};
	}
	
	/*
	 * public static PerformOperation is_prime(){ return (int a) ->
	 * java.math.BigInteger.valueOf(a).isProbablePrime(1); }
	 */

//	public PerformOperation isPalindrome() {
//		return a-> String.valueOf(a).equals(StringUtils.reverse(String.valueOf(a))); 
//	}
	
//	public static PerformOperation is_palindrome(){
//        return (int a) ->  Integer.toString(a).equals( new StringBuilder(Integer.toString(a)).reverse().toString() );
//    }

	public PerformOperation1 isPalindrome() {
		return a -> {
			String reverseStr = "";
			String input = String.valueOf(a);
			for (int i = (input.length() - 1); i >= 0; --i) {
				reverseStr = reverseStr + input.charAt(i);
			}
			return input.equalsIgnoreCase(reverseStr);
		};
	}

}

public class LamdaExpressionTest {

	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation1 op;
		boolean ret = false;
		String ans = null;
		while (T-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}
}

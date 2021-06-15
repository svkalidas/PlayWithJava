package com.ksv.codingChallenge;

import java.io.*;
import java.util.*;

@FunctionalInterface
interface PerformOperation1 {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	public PerformOperation isOdd() {
		return t -> t % 2 != 0;
	}

	public PerformOperation isPrime() {
		return t -> t % 2 != 0 && t % 3 != 0;
	}

	public PerformOperation isPalindrome() {
		return this::checkForPalindrome;
	}

	private boolean checkForPalindrome(int num) {

		String input = String.valueOf(num);

		for (int i = 0; i < input.length() / 2; i++) {

			if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
				return false;
			}
		}

		return true;

	}

}

public class Solution {

	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
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

package com.ksv.codingChallenge;

import java.util.Scanner;
import java.util.Stack;

public class SymetricString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			System.out.println(isBalanced(input));
		}
		
		sc.close();
	}

	private static boolean isBalanced(String input) {

		if (input.isEmpty())
			return true;
		if (input.length() % 2 != 0)
			return false;

		Stack<Character> t = new Stack<>();
		for (int i = 0; i < input.length(); i++) {
			Character c = input.charAt(i);
			if (c == '{')
				t.push('}');
			else if (c == '[')
				t.push(']');
			else if (c == '(')
				t.push(')');
			else if ((c == '}' || c == ']' || c == ')') && t.isEmpty())
				return false;
			else if (!t.isEmpty() && c != t.pop()) {
				return false;
			}

		}

		return t.isEmpty();
	}
}

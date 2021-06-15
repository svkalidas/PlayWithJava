package com.ksv.codingChallenge;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class DequeueTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque();
		int n = in.nextInt();
		int m = in.nextInt();
		long max = 0;
//		int count = 0;
//		for (int i = 0; i < n; i++) {
//			int num = in.nextInt();
//			count++;
//			deque.addLast(num);
//			if (count == m) {
//				count--;
//				long size = deque.stream().distinct().count();
//				max = size>max?size:max;
//				deque.poll();
//			}
//		}
		
		HashSet<Integer> count = new HashSet<>();
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			count.add(num);
			deque.addLast(num);
			if (deque.size() == m) {
				max = count.size()>max?count.size():max;
				Integer poll = deque.poll();
				if(!deque.contains(poll))count.remove(poll);
			}
		}

		System.out.println(max);
	}
}

package com.ksv.study;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class CollectionTest {

	public static void main(String[] args) {
		
		Object testList = new ArrayList(Arrays.asList("ABSA"));
		
		if(testList instanceof Object[]) {
			System.out.println(Arrays.toString((Object[])testList).contains("ABSA"));
		}else if(testList instanceof List) {
			System.out.println(((List)testList).contains("ABSA"));
		}
		
//		if(testList.contains("xyz")) {
//			System.out.println("found xyz");
//		}
		
		Child child = null;
		
		if(child instanceof Child) {
			System.out.println(child);
		}
		
		String input = "-1200+";

		System.out.println(input.replaceAll("[-+]", ""));
		
		System.out.println(new BigDecimal(input).abs());
		
		List<String> myList = new ArrayList<>();
		Queue<String> myQueue = new PriorityQueue<>();
		Set<String> mySet = new HashSet<>();

		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Amit Sharma");
		queue.add("Vijay Raj");
		queue.add("JaiShankar");
		queue.add("Raj");
		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());
		System.out.println("iterating the queue elements:");
		Iterator<String> itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}

package com.ksv.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class TestQueue {

	public static void main(String[] args) {
		Queue<String> queue =  new PriorityQueue<>(2);
		
		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(1);
		try {
			
			boolean add = queue.add("abc");
			boolean add2 = queue.add("xyz");
			boolean add3 = queue.add("mno");
			
			boolean add4 = blockingQueue.add("first");
			//blockingQueue.put("Second");
			boolean offer = blockingQueue.offer("Second");
			boolean offer2 = blockingQueue.offer("Second", 6000, TimeUnit.MILLISECONDS);
			//boolean add5 = blockingQueue.add("Second");
			
		}catch (Exception e) {
			System.out.println("Unable to add element");
		} 	
		
		
		List<String> testList = Arrays.asList("asdf","asdfs","cxvsdf");
		
		Iterator<String> iterator = testList.iterator();
		
		iterator.hasNext();
		System.out.println(iterator.next());
		
		
	}
}

package com.ksv.stream;

import java.util.stream.Stream;

public class StreamGeneration {

	public static void main(String[] args) {
		
		
		Integer[] fib = {0,1};
		
		Stream<Integer> stream = Stream.generate(()->{
			
			Integer result = fib[1];
			fib[1] = fib[0]+result;
			fib[0] = result;
			return result;
		});
		
		System.out.println(stream.toString());
	}
}

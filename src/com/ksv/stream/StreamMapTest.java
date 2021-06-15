package com.ksv.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapTest {

	public static void main(String[] args) {
		
		List<List<String>> list = new ArrayList<>();
		
		list.add(Arrays.asList("a","d", "e","r"));
		list.add(Arrays.asList("t","y","v"));
		list.add(Arrays.asList("k","c","n"));
		
		List<String> collect = list.stream().flatMap(i -> i.stream().map(String::toUpperCase)).sorted().collect(Collectors.toList());
		
		List<Stream<String>> collect2 = list.stream().map(i -> i.stream().map(String::toUpperCase).sorted()).peek(s-> s.forEach(l->System.out.println(l))).collect(Collectors.toList());
		
		System.out.println("---------------------");
		collect.forEach(System.out::println);
	}
}

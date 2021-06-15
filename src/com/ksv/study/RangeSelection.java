package com.ksv.study;

import java.io.ObjectInputStream.GetField;
import java.util.NavigableMap;
import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

public class RangeSelection {

	private static final NavigableMap<Integer, String> ageCriteria = new TreeMap<>();
	static {
		ageCriteria.put(18, "A");
		ageCriteria.put(28, "A");
		ageCriteria.put(29, "B");
		ageCriteria.put(39, "B");
		ageCriteria.put(40, "C");
		ageCriteria.put(50, "C");
	}
	
	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
			int j = ThreadLocalRandom.current().nextInt(15, 55);
			System.out.println(j +" : "+ getCriteriaBasedOnAge(j));
		}
	}
	
	private static String getCriteriaBasedOnAge(int age) {
		SortedMap<Integer, String> sortedMap = ageCriteria.tailMap(age);
		return sortedMap.get(sortedMap.firstKey());
	}
	
}

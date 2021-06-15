package com.ksv.threads;

import java.util.HashMap;
import java.util.Map;

public class MapConscept {

	String name;
	int age;
	@Override
	public int hashCode(){
		return 1;
	}
	@Override
	public boolean equals(Object other){
		return true;
	}
	
	public static void main(String[] args) {
		MapConscept m1 = new MapConscept();
		MapConscept m2 = new MapConscept();
		Map<MapConscept, MapConscept> myMap = new HashMap<>();
		myMap.put(m1, m1);
		myMap.put(m2, m2);
		
		System.out.println(myMap.size());
	}
}

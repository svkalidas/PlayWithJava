package com.ksv.collection;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		
		Map<String, String> map = new LinkedHashMap<>();
		
		String put1 = map.put("kksv", "Kalidas");
		String put2 = map.put("dsv", "dilna");
		Set<String> keySet = map.keySet();
		Collection<String> values = map.values();
		Set<Entry<String, String>> entrySet = map.entrySet();
	}
}

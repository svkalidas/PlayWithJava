package com.ksv.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class FinalClass implements Cloneable{
	private final int id;
	private final String name;
	private final Map<String, String> subjects;
	
	//Shallow Copy
//	public FinalClass(int id, String name, Map<String, String> subjects) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.subjects = subjects;
//	}
	
	//Deep copy
	public FinalClass(int id, String name, Map<String, String> subject) {
		this.id = id;
		this.name = name;
		Map<String, String> a = new HashMap<>();
		Iterator<String> keys = subject.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			a.put(key, subject.get(key));
		}
		this.subjects = a;
		
	}

	@Override
	public FinalClass clone() throws CloneNotSupportedException {
		return (FinalClass)super.clone();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Map<String, String> getSubjects() {
		return subjects;
	}
	
	@Override
	public String toString() {
		return "id : "+id+" name: "+name+" Subjects : "+subjects.toString();
	}
	
}

public class FinalClassExample implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException {
		
		String  [] j = {"abs","2","0","101", "20", "3"};
		Arrays.sort(j);
		System.out.println(Arrays.toString(j));
		
		int  [] i = {-130,-3,4,55,2,2,-50};
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
		
		Map<String, String> subjects = new HashMap<String, String>();
		
		Integer id = 101;
		String name = "Kalidas";
		
		subjects.put("MA", "Malayalam");
		subjects.put("EN", "English");
		
		
		FinalClass f1 = new FinalClass(id, name, subjects);
		
		FinalClass f2 = f1.clone();
		
		System.out.println("f1 : "+f1.hashCode());
		
		System.out.println("f2 : "+f2.hashCode());
		
		System.out.println(f1);
		
		subjects.put("PH", "Phisycs");
		id = 102;
		
		System.out.println(f1);
		
		System.out.println(f2);
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}




























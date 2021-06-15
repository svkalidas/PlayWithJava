package com.ksv.collection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Child extends Parent{
	
	private String name;
	private Integer id;

	@Override
	protected String getData() {
		System.out.println(super.getData());
		return getInfo();
	}
	
	private String getInfo() {
		return "Child";
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.getData());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private Map<Integer, String> getChildMap(List<Child> childList){
		
		return childList.stream().collect(Collectors.toMap(Child::getId, Child::getName));
	}
	
	
}

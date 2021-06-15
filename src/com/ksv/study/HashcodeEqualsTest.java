
package com.ksv.study;

import java.util.HashMap;
import java.util.Map;

public class HashcodeEqualsTest {

	private String name;
	private String address;
	
	public HashcodeEqualsTest(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashcodeEqualsTest other = (HashcodeEqualsTest) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}




	public static void main(String[] args) {
		
		HashcodeEqualsTest h1 = new HashcodeEqualsTest("abc", "xyz");
		HashcodeEqualsTest h2 = new HashcodeEqualsTest("abc", "xyz");
		
		Map<HashcodeEqualsTest, String> hMap = new HashMap<>();
		
		hMap.put(h1, "h1");
		
		hMap.put(h2, "h2");
		
		hMap.entrySet().forEach(e->System.out.println(e.getKey()+" : "+e.getValue()));
	}

}

package com.ksv.java8;

public class ParentClass {

	
	public static class StaticMemberOfaClass{
		Integer id;
		
		public Integer getId() {
			return id;
		}
	}
	
	public class InnerClass {
		Integer id;
		
		public Integer getId() {
			return id;
		}
		
	}
}

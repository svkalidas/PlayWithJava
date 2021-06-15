package com.ksv.java8;

public interface NestedClasses {
	
	public static final StaticMemberClass staticMemberClass = new StaticMemberClass() {
		@Override
		public String getInfo() {
			return "AnonemousInnerClass in an interface";
		}
	};

	
	 class innerClass {
		
		 public innerClass() {
			 
		}
		 
		 String getInfo() {
			 return "Inner class in an interface";
		 }
	}
	 
	 static class StaticMemberClass {
		 
		 public StaticMemberClass() {
			 
		}
		 
		 public String getInfo() {
			 return "Static member class in an interface";
		 }
	 }
	 
	 default void forLocalInnerClass() {
		  
		 class LocalInnerClass {
			 
			 private String getInfo() {
				 return "LocalInnerClass from a default method of an interface";
			 }
			 
			 private String getOuterClassInfo() {
				 return staticMemberClass.getInfo();
			 }
			 
		 }
	 }
}

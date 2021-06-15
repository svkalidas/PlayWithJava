package com.ksv.java11;

public class Test {

	String var;
	int max_value = 2147483647;

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public Test(int i) {
		var var = i;
	}

	public static void main(String[] args) {
		var j = 10;
		var s = "";
		
		int m = 7;
		int k = m;
		k=10; 
		System.out.println(m);
		
		
		//ArrayList &lt;String&gt; list = new ArrayList(); list.add("behold"); list.add("bend"); list.add("bet"); list.add("bear"); list.add("beat"); list.add("become"); list.add("begin"); 
		
		//var list = new ArrayList&lt;String&gt;();
		

		for(var i = 0; i<10; i++) {
			
		}
	}

	private String var() {
		var var = "var";
		return var;
	}

	private String getName(int id) {
		var name = "MyName";
		// name = 1; once the variable of type var is assigned with a type of value,
		// then cannot change the type
		return name;
	}
}

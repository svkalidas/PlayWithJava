package com.ksv.java8;

public class IdentityHashCode {

	private String id;
	public IdentityHashCode(String id) {
		this.id = id;
	}
	
	public static void main(String[] args) {
		
		IdentityHashCode id1 = new IdentityHashCode("3");
		IdentityHashCode id2 = new IdentityHashCode("3");
		IdentityHashCode id3 = new IdentityHashCode("3");
		
		System.out.println(System.identityHashCode(id1) +" : "+ id1.hashCode());
		System.out.println(System.identityHashCode(id2) +" : "+ id2.hashCode());
		System.out.println(System.identityHashCode(id3) +" : "+ id3.hashCode());
		System.out.println(System.identityHashCode(null));
	}
}

package com.ksv.study;

public class Parent {

	String getAddress(){
		String address =  getName();
		return address + ": House No.2, Canada";
	}
	
	String getName(){
		return "Alex";
	}
}

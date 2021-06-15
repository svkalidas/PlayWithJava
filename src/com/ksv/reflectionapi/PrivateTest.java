package com.ksv.reflectionapi;

public class PrivateTest {
	
	private static PrivateTest INSTANCE;

	private PrivateTest() {
	}
	
	public static PrivateTest getInstance() {
		return INSTANCE = INSTANCE == null? new PrivateTest():INSTANCE;
	}
}

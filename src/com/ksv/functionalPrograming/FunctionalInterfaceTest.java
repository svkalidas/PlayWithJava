package com.ksv.functionalPrograming;

import org.apache.commons.lang3.StringUtils;

public interface FunctionalInterfaceTest {
	
	String result = "-ve";
	
	String getResult();
	
	default String setResult(String result) {
		return !StringUtils.isEmpty(result)? result:FunctionalInterfaceTest.result;
	}
	
	static String updateResult(String result) {
		return !StringUtils.isEmpty(result)? result:FunctionalInterfaceTest.result;
	}
}

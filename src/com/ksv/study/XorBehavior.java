package com.ksv.study;

public class XorBehavior {

	public static void main(String[] args) {
		boolean param1 = false;
		boolean param2 = true;
		
		if(Boolean.logicalXor(param1, param2)){
			System.out.println("Logical Xor");
		}else{
			System.out.println("Not logical Xor");
		}
	}
}

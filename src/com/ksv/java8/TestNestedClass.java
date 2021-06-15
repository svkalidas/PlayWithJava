package com.ksv.java8;

import com.ksv.java8.ParentClass.InnerClass;
import com.ksv.java8.ParentClass.StaticMemberOfaClass;

public class TestNestedClass {

	public static void main(String[] args) {
		
		StaticMemberOfaClass stm = new StaticMemberOfaClass();
		stm.getId();
		
		ParentClass pc = new ParentClass();
		
		InnerClass inc = pc.new InnerClass();
		inc.getId();
	}
}

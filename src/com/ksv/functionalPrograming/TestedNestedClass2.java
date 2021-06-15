package com.ksv.functionalPrograming;

import com.ksv.java8.ParentClass;
import com.ksv.java8.ParentClass.InnerClass;
import com.ksv.java8.ParentClass.StaticMemberOfaClass;

public class TestedNestedClass2 {

	public static void main(String[] args) {
		
		StaticMemberOfaClass stm = new StaticMemberOfaClass();
		stm.getId();
		
		/* OR */
		
		ParentClass.StaticMemberOfaClass stm1 = new ParentClass.StaticMemberOfaClass();
		stm1.getId();
		
		ParentClass pc = new ParentClass();
		
		InnerClass inc = pc.new InnerClass();
		
		inc.getId();
		
	}
}

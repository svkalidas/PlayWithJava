package com.ksv.innerclass;

public class InnerClassTest {

	public static void main(String[] args) {
		//Anonymous inner class
		ParentClass parent = new ParentClass() {
			
			@Override
			public String getName() {
				return noName();
			};
			
			private String noName() {
				return "Name is not availage";
			}
		};
		
		parent.setJob("IT Consultant");
		parent.setName("Jose");
		
		System.out.println(parent.getName());
	}
}

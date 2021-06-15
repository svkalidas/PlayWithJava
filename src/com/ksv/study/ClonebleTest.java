package com.ksv.study;

public class ClonebleTest implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ClonebleTest t1 = new ClonebleTest();
		ClonebleTest t2 = (ClonebleTest) t1.clone();
		System.out.println(t1.toString());
		System.out.println(t2.toString());
	}
}

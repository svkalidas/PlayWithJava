package com.ksv.study;

public final class ImutableObjectTest {

	final Immutable1 immutable;
	
	public ImutableObjectTest(Immutable1 immutable) {
		this.immutable = new Immutable1(immutable.id);
	}
	
	public static void main(String[] args) {
		Immutable1 immutable = new Immutable1(1);
		
		ImutableObjectTest test = new ImutableObjectTest(immutable);
		System.out.println(test.immutable.id);
		immutable.id =2;
		System.out.println(test.immutable.id);
	}
}

class Immutable1 {
	int id;
	public Immutable1(int id) {
		this.id =id;
	}
}


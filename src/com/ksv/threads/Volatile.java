package com.ksv.threads;

class A implements Runnable{
	 int j = 5;
	@Override
	public void run() {
		synchronized (this) {
			j++;
			System.out.println(j);
		}
		
	}
}

public class Volatile {

	public static void main(String arg[]) {
		A a = new A();
		for(int i =0;i<2;i++) {
			new Thread(a ).start();
		}
	}
	
}

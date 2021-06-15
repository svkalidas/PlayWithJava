package com.ksv.threads;

class MyThread extends Thread{
	
	public static synchronized void m1(){
		System.out.println("Methode called by : "+ Thread.currentThread().getName());
	}
	
   public void run(){
	   for(int i = 0; i < 10; i++){
		   MyThread.m1();
	   }
   }
}
public class StaticSynchronizationDemo {

	public static void main(String[] args) {
		Thread.currentThread().setName("MyMain");
		
		MyThread t = new MyThread();
		t.setName("MyThread");
		t.start();
		
		for(int i = 0; i<100; i++){
			MyThread.m1();
		}
	}
}

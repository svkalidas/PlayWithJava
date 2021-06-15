package com.ksv.threads;

class DeadLockTest1{
	public synchronized void m1(DeadLockTest2 test2){
		System.out.println("m1 methode of DeadLockTest1");
		try{
			Thread.sleep(9000);
		}catch(InterruptedException e){
			
		}
		test2.display();
	}
	
	public synchronized void display(){
		System.out.println("Display Method of DeadLockTest1");
	}
}

class DeadLockTest2{
	
	public synchronized void m1(DeadLockTest1 test1){
		System.out.println("m1 methode of DeadLockTest2");
		try{
			Thread.sleep(9000);
		}catch(InterruptedException e){
			
		}
		test1.display();
	}
	
	public synchronized void display(){
		System.out.println("Display methode of DeadLockTest2");
	}
}

public class DeadLockDemo extends Thread{

	DeadLockTest1 test1 = new DeadLockTest1();
	DeadLockTest2 test2 = new DeadLockTest2();
	public void run(){
		System.out.println(Thread.currentThread().getName() + " started to execute");
		test2.m1(test1);
	}
	public static void main(String[] args) {
		DeadLockDemo demo = new DeadLockDemo();
		demo.start();
		System.out.println(Thread.currentThread().getName() + " started to execute");
		demo.test1.m1(demo.test2);
	}
}

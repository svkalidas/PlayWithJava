package com.ksv.threads;

class MyClass {
	public void printStringName(){
		System.out.println(Thread.currentThread().getName());
	}
}
class MyThread1 extends Thread{
	MyClass m1;
	MyClass m2;
	public MyThread1(MyClass m1, MyClass m2){
		this.m1 = m1;
		this.m2 = m2;
	}
	public void run(){
		try{
			
			synchronized (m1) {
				
				m1.printStringName();
				
				Thread.sleep(500);
				
				synchronized (m2) {
					
					m2.printStringName();
				}
			}
			
			
		}catch(Exception e){
			e.getMessage();
		}
	}
}

class MyThread2 extends Thread{
	MyClass m1;
	MyClass m2;
	public MyThread2(MyClass m1, MyClass m2){
		this.m1 = m1;
		this.m2 = m2;
	}
	public void run(){
		try{
			
			synchronized (m2) {
				
				m2.printStringName();
				
				Thread.sleep(500);
				
				synchronized (m1) {
					
					m1.printStringName();
				}
			}
			
		}catch(Exception e){
			e.getMessage();
		}
	}
}
public class DeadLockExample {

	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		MyClass m2 = new MyClass();
		
		MyThread1 t1 = new MyThread1(m1, m2);
		MyThread2 t2 = new MyThread2(m1, m2);
		
		System.out.println(Thread.currentThread().getName());
		
		t1.start();
		t2.start();
	}
}

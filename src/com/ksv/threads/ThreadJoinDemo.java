package com.ksv.threads;

class MyRunnable implements Runnable{
	
	Thread t2 = null;
	public MyRunnable(Thread t2) {
		this.t2 = t2;
	}
	@Override
	public void run() {
		
		for(int i =0; i<10; i++){
			try{
				t2.join();
				System.out.println("Seetha Thread ");
				Thread.sleep(2000);
			}catch(InterruptedException e){}
		}
		
	}
	
}

public class ThreadJoinDemo {

	public static void main(String[] args)throws InterruptedException {
		MyRunnable r = new MyRunnable(Thread.currentThread());
		
		Thread t1 = new Thread(r);
		t1.start();
		//t1.join(10000,100);
		
		for(int i = 0; i<10; i++){
			System.out.println("Raman Thread ");
		}
	}
}

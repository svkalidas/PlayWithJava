package com.ksv.study;

class DataClass {
	String name;
	Integer age;
}

class ThreadLocalClass{
	ThreadLocal<DataClass> threadLocal = new ThreadLocal<>();
	
	public void setThreadLocal(ThreadLocal<DataClass> local){
		this.threadLocal = local;
	}
	public ThreadLocal<DataClass> getThreadLocal(){
		return this.threadLocal;
	}
}

class ExecuterThread implements Runnable{
	
	ThreadLocalClass localClass;
	
	public ExecuterThread(ThreadLocalClass localClass) {
		this.localClass = localClass;
	}

	@Override
	public void run() {
		if(localClass.getThreadLocal().get() != null){
			System.out.println(localClass.getThreadLocal().get().name);
			System.out.println(localClass.getThreadLocal().get().age);
		}else{
			System.out.println("ThreadLocal data is not available, Sting new Data");
			DataClass d = new DataClass();
			d.name = "Boby";
			d.age = 23;
			ThreadLocal<DataClass> local = new ThreadLocal<>();
			local.set(d);
			localClass.setThreadLocal(local);
			
			System.out.println(localClass.getThreadLocal().get().name);
			System.out.println(localClass.getThreadLocal().get().age);
		}
		
	}
	
}

public class ThreadLocalExample {

	public static void main(String[] args) throws InterruptedException{
		DataClass d = new DataClass();
		d.name = "kalidas";
		d.age = 24;
		
		ThreadLocalClass t = new ThreadLocalClass();
		
		ThreadLocal<DataClass> local = new ThreadLocal<>();
		local.set(d);
		t.setThreadLocal(local);
		ExecuterThread ex1 = new ExecuterThread(t);
		ex1.run();
		Thread thread = new Thread(new ExecuterThread(t));
		thread.start();
		Thread.sleep(100);
		
	}
}

package com.ksv.threads;

public class ThreadPool {
	String task;

	public ThreadPool(String task) {
		this.task = task;
	}
	public ThreadPool() {
	}

	void doPostPublicattion() {
		int j = 0;;
		for (int i =0; i<10000000; i++){
			j++;
		}
		System.out.println(task+ " executed by " + Thread.currentThread().getName());
	}
}

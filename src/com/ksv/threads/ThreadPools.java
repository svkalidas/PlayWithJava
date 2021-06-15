package com.ksv.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPools {

	public static void main(String[] args) {
		
		//Different way to initialize an ExecutorService 
		ExecutorService executorService1 = new ThreadPoolExecutor(10, 20, 3000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(100));
		
		ExecutorService executorService2 = Executors.newFixedThreadPool(10);
		
		ExecutorService executorService3 = Executors.newScheduledThreadPool(30);
		
		List<Callable<String>> tasks = new ArrayList<>();
		
		tasks.add(() -> Thread.currentThread().getName() + " Task-1");
		tasks.add(ThreadPools::task2);
		tasks.add(()-> Thread.currentThread().getName()+" Task-3");
		
		try {
			List<Future<String>> invokeAll = executorService1.invokeAll(tasks);
			
			invokeAll.forEach(f-> {
				if(f.isDone()) {
					try {
						System.out.println(f.get() +" : done");
					} catch (InterruptedException | ExecutionException e) {
						e.printStackTrace();
					}
				}
			});
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	private static String task2() {
		return Thread.currentThread().getName()+" Task2";
	}
}

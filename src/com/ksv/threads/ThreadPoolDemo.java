package com.ksv.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo extends ThreadPool{
	
	public static void main(String[] args) {
		List<ThreadPool> poolList = new ArrayList<>();
		ThreadPool pool1 = new ThreadPool("First policy creation");
		ThreadPool pool2 = new ThreadPool("Second policy creation");
		poolList.add(pool1);
		poolList.add(pool2);
		executeThreadPool(poolList);
		
		System.out.println("Policy creation completed");;
	}

	 private static void executeThreadPool(List<ThreadPool> threadPoolList) {

		ExecutorService extThreadPool = Executors.newCachedThreadPool();
		List<Callable<ThreadPool>> taskList = new ArrayList<>();
		threadPoolList.forEach(threadPool ->{
			Callable<ThreadPool> task = new Callable<ThreadPool>() {

				@Override
				public ThreadPool call() throws Exception {
					threadPool.doPostPublicattion();
					return threadPool;
				}
			};
			taskList.add(task);
		});
		
		try {
			extThreadPool.invokeAll(taskList);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

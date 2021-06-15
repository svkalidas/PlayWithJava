package com.ksv.threads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class GenericClassExample<T> {
	
	T t;
	public static void main(String[] args) {
		getGenerics(10);
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		for(int i=0; i <=10;i++){
			list1.add(i);
		}
		
		Iterator<Integer> it = list1.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("-------------------------");
		list1.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		});
		
		System.out.println("---------------------------");
		
		MyConsumer consumer = new MyConsumer();
		
		list1.forEach(consumer);
		
		Runnable r1 = ()->{
							System.out.println("haii");
						};
		MyInterface myInter = ()->{
										System.out.println("MyAbstractMethode");
								};
		myInter.myAbstractMethod();
	}
	public static void getGenerics(Number t){
		
		return ;
	}
	
	@FunctionalInterface
	interface MyInterface {
		
		void myAbstractMethod();
		
		default void afsad(){
			
		}
	}
	
}

class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		
		System.out.println("Sl No: "+t);
		
	}
	
}

class genericMethodExample{
	
	public <E> E getGenerics(E elements){
		System.out.println(elements);
		GenericClassExample<? extends Object> e1 = (GenericClassExample<? extends Object>) elements;
		return elements;
	}
}
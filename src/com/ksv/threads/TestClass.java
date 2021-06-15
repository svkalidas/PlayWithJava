package com.ksv.threads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class TestClass2 implements Iterable<Object>{
	static int i =0;
	static Object[] a1 = null;
	static{
		a1 = new Object[10];
	}
	@Override
	public Iterator<Object> iterator() {
		Iterator<Object> it = new Iterator<Object>() {

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Object next() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		return it ;
	}
	
	public void add(Object obj){
		a1[i] = obj;
		i++;
	}
}
public class TestClass {

	public static void main(String[] args) {
		Integer i = null;
		List l1 = new ArrayList();
		l1.add("Hello");
		l1.add(2);
		l1.add('c');
		
		List<String> l2 = new ArrayList<String>();
		l2.add("Haii");
		//l2.add(2);
		try{
			numberPrint(i);
		}catch(Exception e){
			e.printStackTrace();
		}
		Object[] a1 = new Object[10];
		System.out.println(a1.length);
		List<TestClass2> list =  new ArrayList<>();
		
		Iterator it1 = list.iterator();
	}
	
	public static void numberPrint(int i){
		System.out.println(i);
	}
}

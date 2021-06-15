package com.ksv.revision;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

interface IArrayExamples<T>{
	T getType() ;
}

public class ArraysExamples<T extends Collection<?>> implements IArrayExamples<T>{
// Constructor cannot be static always non static
//	static ArraysExamples() {
//		
//	}
	
	// generic data type is only for non static components
	private T i;
	public ArraysExamples(T i) {
		//Recursive calling of constructor is compile time error
		// this();
		//ArraysExamples a = new ArraysExamples();
		this.i = i;
	}
	
	public void myArrays() throws FileNotFoundException{
		//Recursive calling of method is runtime error (will throw stackOverflow error)
		this.myArrays();
	}

	public static void main(String[] args) {
		
		int[] i = {1,2,3};
		int[] j = new int[10];
		j[0]= 1;
		int[] k = new int[] {1,2,4};
		
		System.out.println(j.length);
		
		String s = "a";
		String t = new String("a");
		System.out.println(s.hashCode());
		System.out.println(t.hashCode());
		System.out.println(s == t);
		System.out.println(s.equals(t));
		
		try {
			File f = new File("/kalidas");
			BufferedReader reader = new BufferedReader(new FileReader(f));
			reader.readLine();
		}catch(IOException e){
		}finally {
			
		}
			
		ArraysExamples<?> ex1 = new ArraysExamples<List<?>>(new ArrayList<>());
		
		ArraysExamples<Set<?>> ex2 = new ArraysExamples<Set<?>>(new HashSet<String>());
		
		ex1 = ex2;
		
		//ex2 = ex1;
	}

	@Override
	public T getType() throws NullPointerException{
		return null;
	}
}

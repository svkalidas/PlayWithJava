package com.ksv.collection;

import java.io.ObjectInputStream.GetField;

import org.apache.commons.lang3.math.NumberUtils;

public class ArrayTest {
	
	static native Object resolve(Object self, Class<?> caller,
	            boolean speculativeResolve) throws LinkageError, ClassNotFoundException;

	public static void main(String[] args) throws ClassNotFoundException, LinkageError {
		
		String absValue = String.valueOf(Math.abs(+120));
		String absValue1 = String.valueOf(Math.abs(-120));
		
		if(NumberUtils.isCreatable("120")) {
			System.out.println(Math.abs(Integer.parseInt("120")));
		}
		
		resolve(null, ArrayTest.class, true);
		int j = 5 ^ 2;
		
		MyArray<String> myArray =  new MyArray<String>(5);
		
		String result = myArray.get(2);
		
		boolean result2 = myArray.add(2, "KKSV");
		
		System.out.println(myArray);
		
		MyArray<String> myArray2d = new MyArray<>(2, 2);
		
		myArray2d.add(0,0, "Kalidas");
		myArray2d.add(0,1, "S V");
		
		myArray2d.add(1,0, "Dilna");
		myArray2d.add(1,1, "S V");
		
		System.out.println(myArray2d);
		
		System.out.println(myArray2d.get(0,1));
		
		myArray2d.replace(0, 0,"KK");
		myArray2d.replace(0, 1,"SV");
		
		System.out.println(myArray2d);
	}
}

package com.ksv.reflectionapi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) throws Exception {
		
		Test t1 = Test.class.getConstructor().newInstance();
		
		Test t2 = Test.class.getDeclaredConstructor().newInstance();
		
		Constructor<?> tCon = Test.class.getEnclosingConstructor();
		
		Class<? extends Test> t1Class = t1.getClass();
		
		Field field = t1Class.getField("k");
		field.set(t2, "MyPublicField");
		
		System.out.println(field.get(t1));
		
		System.out.println(field.get(t2));
		
		Field declaredField = t1Class.getDeclaredField("s");
		
		boolean canAccess = declaredField.canAccess(t1);
		
		declaredField.setAccessible(true);
		
		System.out.println(declaredField.get(t1));
		
		declaredField.set(t1, "MyPrivateField");
		
		System.out.println(declaredField.get(t1));
		
		Method method1 = Test.class.getMethod("method1");
		
		boolean canAccess2 = method1.canAccess(t1);
		
		method1.invoke(t1);
		
		Method method3 = t1Class.getDeclaredMethod("method3");
		method3.setAccessible(true);
		method3.invoke(t1);
		
		Constructor<PrivateTest> privateTestCon = PrivateTest.class.getDeclaredConstructor();
		privateTestCon.setAccessible(true);
		PrivateTest privateTestins = privateTestCon.newInstance();
		
		Field field2 = PrivateTest.class.getDeclaredField("INSTANCE");
		field2.setAccessible(true);
		field2.set(privateTestins, privateTestins);
		System.out.println(field2.get(privateTestins));
		
		
	}
}

package com.ksv.threads;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class DataTransferObject implements Serializable{

	String name;
	String age;
	Integer salary;
	
	public DataTransferObject(String name, String age, Integer salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
}
public class SerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		DataTransferObject obj = new DataTransferObject("Kalidas S V","24",45000);
		FileOutputStream fo = new FileOutputStream("data.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		oo.writeObject(obj);
		oo.flush();
		oo.close();
		
		FileInputStream fi = new FileInputStream("data.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		DataTransferObject objin = (DataTransferObject)oi.readObject();
		oi.close();
		
		System.out.println(objin.name);
		System.out.println(objin.age);
		System.out.println(objin.salary);
		
	}
}


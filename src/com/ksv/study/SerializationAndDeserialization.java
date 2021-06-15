package com.ksv.study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class SerializationAndDeserialization implements Serializable{

	String name;
	/*String designation;
	String slalary;*/
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerializationAndDeserialization s = new SerializationAndDeserialization();
		s.name = "Kalidas";
		File f1 = new File("C:/Users/RETNASINGH/Desktop/KalidasDocumentsMyText.txt");
		FileOutputStream fo = new FileOutputStream(f1);
		ObjectOutputStream op = new ObjectOutputStream(fo);
		op.writeObject(s);
		
		FileInputStream fi = new FileInputStream(f1);
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		SerializationAndDeserialization s1 = (SerializationAndDeserialization) oi.readObject();
		System.out.println(s1.name);
	}
}

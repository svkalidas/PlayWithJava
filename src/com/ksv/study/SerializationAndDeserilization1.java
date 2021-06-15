package com.ksv.study;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationAndDeserilization1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File f1 = new File("C:/Users/RETNASINGH/Desktop/KalidasDocumentsMyText.txt");
		
		FileInputStream fi = new FileInputStream(f1);
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		SerializationAndDeserialization s = (SerializationAndDeserialization) oi.readObject();
		System.out.println(s.name);
		/*System.out.println(s.designation);
		System.out.println(s.slalary);*/
	}
}

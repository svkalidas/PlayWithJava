package com.ksv.revision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {

	private static class Book implements Serializable {

		private static final long serialVersionUID = 1L;
		//Will not serialize and get default value while deserialize
		private transient String catogory;
		
		//original value get serialize if we variable have final along transient keyword. 
		private final transient String auther = "Kalidas";

		public String getCatogory() {
			return catogory;
		}

		public void setCatogory(String catogory) {
			this.catogory = catogory;
		}

		public String getAuther() {
			return auther;
		}

//		public void setAuther(String auther) {
//			this.auther = auther;
//		}
	}

	public static void main(String[] args) {
		Book book = new Book();
		//book.setAuther("Kalidas");
		book.setCatogory("Fiction");
		try (FileOutputStream fout = new FileOutputStream("test.txt");
				ObjectOutputStream objOut = new ObjectOutputStream(fout);) {
			objOut.writeObject(book);
			deserialize();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void deserialize() {
		try (FileInputStream fIn = new FileInputStream("test.txt");
				ObjectInputStream objIn = new ObjectInputStream(fIn)) {
			Book book = (Book) objIn.readObject();

			System.out.println(" Auther Name : " + book.getAuther());
			System.out.println(" Category : " + book.getCatogory());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

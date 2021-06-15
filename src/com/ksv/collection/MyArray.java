package com.ksv.collection;

import java.util.MissingFormatArgumentException;

public class MyArray<T> {

	public int length;

	private int index;
	private T data;
	private MyArray<T> array;
	private MyArray<T> array2;
	private String start;
	private String end;

	public MyArray(int length) {
		initializeProperties();
		this.length = length;
		this.index = 0;
		if (length > 0) {
			array = new MyArray<>(index + 1, length, null);
		}
	}

	public MyArray(int length, int length2) {
		initializeProperties();
		this.length = length;
		this.index = 0;
		if (length > 0) {
			array2 = new MyArray<>(length2);
			array = new MyArray<>(index + 1, length, length2);
		}
	}

	private MyArray(int index, int length, Integer length2) {
		this.index = index;
		this.length = length;
		if (length2 != null) {
			this.array2 = new MyArray<>(length2);
		}
		index++;
		if (index < length) {
			this.array = new MyArray<>(index, length, null);
		}
	}

	private void initializeProperties() {
		this.start = "[";
		this.end = "]";
	}

	public T get(int index) {
		if(array2 == null) {
			validateIndex(index);
			return this.index == index ? this.data : this.array.get(index);
		}else {
			throw new MissingFormatArgumentException("Invalid index data for two dimentional array");
		}
	}
	
	public T get(int index1, int index2) {
		validateIndex(index1);
		return this.index == index1 ? this.array2.get(index2) : this.array.get(index1,index2);
	}

	public boolean add(int index, T data) {
		if(array2 == null) {
			validateIndex(index);
			if (this.index == index) {
				this.data = data;
				return true;
			}
			return this.array.add(index, data);
		}else {
			throw new MissingFormatArgumentException("Invalid index data for two dimentional array");
		}
	}
	
	public boolean add(int index1, int index2, T data) {
		validateIndex(index1);
		if (this.index == index1) {
			return this.array2.add(index2, data);
		}
		return this.array.add(index1, index2, data);
	}

	public boolean replace(int index, T data) {
		if(array2 ==  null) {
			validateIndex(index);
			if (this.index == index) {
				this.data = data;
				return true;
			}
			return this.array.replace(index, data);
		}else {
			throw new MissingFormatArgumentException("Invalid index data for two dimentional array");
		}
	}
	
	public boolean replace(int index1, int index2, T data) {
		validateIndex(index1);
		if (this.index == index1) {
			return this.array2.replace(index2, data);
		}
		return this.array.replace(index1, index2, data);
	}

	public boolean replace(T data1, T data2) {
		if(array2 == null) {
			if (this.data == data1) {
				this.data = data2;
				return true;
			}
			return this.array != null ? this.array.add(index, data) : false;
		}else {
			throw new MissingFormatArgumentException("Invalid index data for two dimentional array");
		}
	}
	
	public boolean replace(int index, T data1, T data2) {
		validateIndex(index);
		if(this.index == index) {
			return this.array2.replace(data1, data2);
		}
		return this.array.replace(index, data1, data2);
	}

	public boolean replaceAll(MyArray<T> newArray) {
		if(array2 == null) {
			if (newArray != null && this.index < newArray.length) {
				this.data = newArray.get(this.index);
				if (this.array != null) {
					this.array.replaceAll(newArray);
				}
			} else {
				throw new MissingFormatArgumentException("replace with 'null' is not allowed");
			}
			return true;
		}else {
			throw new MissingFormatArgumentException("Invalid index data for two dimentional array");
		}
	}
	
	public boolean replaceAll(int index, MyArray<T> newArray) {
		if (newArray != null) {
			validateIndex(index);
			if(this.index == index) {
				return this.array2.replaceAll(newArray);
			}
			return this.array.replaceAll(index, newArray);
		} else {
			throw new MissingFormatArgumentException("replace with 'null' is not allowed");
		}
	}

	private void validateIndex(int index) {
		if (this.length == 0 || index < this.index || index >= this.length) {
			throw new IndexOutOfBoundsException(index);
		}
	}

	@Override
	public String toString() {
		return (this.start != null ? this.start : "") + (this.data != null ? this.data : " ")
				+ ((this.array2 != null ? this.array2.toString() : ""))
				+ (this.array != null ? "," + this.array.toString() : "") + (this.end != null ? this.end : "");
	}

}

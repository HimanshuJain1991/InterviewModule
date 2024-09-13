package com.rays.comparator;

public class Student {
	int id = 0;
	String name = null;
	int rollNo = 0;

	public Student(int id, String name, int rollNo) {
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name+" "+rollNo;
	}

}

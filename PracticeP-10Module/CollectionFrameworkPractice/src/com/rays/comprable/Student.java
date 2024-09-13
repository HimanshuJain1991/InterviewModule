package com.rays.comprable;

public class Student implements Comparable<Student> {
	public String name = null;
	public int marks = 0;
	public int rollNo = 0;

	public Student(String name, int marks, int rollNo) {
		this.name = name;
		this.marks = marks;
		this.rollNo = rollNo;
	}

	@Override
	public int compareTo(Student o) {

		// return marks - o.marks;
		return name.compareTo(o.name);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + marks + " " + rollNo;
	}

}

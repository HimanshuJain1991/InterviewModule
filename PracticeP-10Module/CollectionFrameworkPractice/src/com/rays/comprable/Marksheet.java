package com.rays.comprable;

public class Marksheet implements Comparable<Marksheet> {
	public String rollNo;
	public String name;
	public int marks;

	public Marksheet(String rollNo, String name, int marks) {
		// TODO Auto-generated constructor stub
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public int compareTo(Marksheet m) {
		
		return marks - m.marks;

		// return rollNo.compareTo(m.rollNo);
	}

	@Override
	public String toString() {

		return rollNo + " " + name + " " + marks;
	}

}

package com.rays.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(8, "Amit Bansal", 501));
		list.add(new Student(2, "Lavish Ojha", 502));
		list.add(new Student(88, "Himansu Jain", 503));
		//System.out.println(list);
		Collections.sort(list, new CompareById());
		System.out.println("compare by ID");
		System.out.println(list);
//		Collections.sort(list, new CompareByName());
//		System.out.println("compare by name");
//		System.out.println(list);
	}

}

package com.rays.comprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Student("Himanshu Jain", 99, 1));
		list.add(new Student("Riyansh Jain", 85, 2));
		list.add(new Student("Amit Bansal", 75, 3));
		Collections.sort(list);
		for (Object object : list) {

			System.out.println(object);

		}
	}

}

package com.rays.comprable;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarsheetSorting {

	public static void main(String[] args) {
		ArrayList markshet = new ArrayList();
		markshet.add(new Marksheet("13", "Himanshu Jain", 98));
		markshet.add(new Marksheet("68", "Amit Bansal", 80));
		markshet.add(new Marksheet("52", "Riyansh Jain", 100));
		
		System.out.println(markshet);

		Collections.sort(markshet);

		for (Object object : markshet) {
			System.out.println(object);
		}
	}

}

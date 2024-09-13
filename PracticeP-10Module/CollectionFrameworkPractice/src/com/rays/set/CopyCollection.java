package com.rays.set;

import java.util.ArrayList;
import java.util.Collections;

public class CopyCollection {

	@SuppressWarnings("unchecked")
	
	
	
	public static void main(String[] args) {
		ArrayList fromList = new ArrayList();
		ArrayList toList = new ArrayList();
		fromList.add(1);
		fromList.add(2);
		fromList.add(3);fromList.add(99);fromList.add(4);
		System.out.println(fromList);
		Collections.reverse(fromList);
		System.out.println(fromList);
//		Collections.copy(toList, fromList);
//		System.out.println(toList);
		Collections.shuffle(fromList);
		System.out.println(fromList);

	}

}

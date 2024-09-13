package com.rays.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterfaceExample {

	public static void main(String[] args) {
		SortedSet ss=new TreeSet();
		ss.add(9);
		ss.add(7);
		ss.add(3);ss.add(2);
		ss.add(5);
		ss.add(1);
		ss.add(3);
		System.out.println(ss);
		//System.out.println(ss.first());
	//	System.out.println(ss.last());
//		System.out.println(ss.headSet(2));
//		System.out.println(ss.tailSet(5));
//		//System.out.println...........(ss.subSet(3, 7));
//		SortedSet<Integer> st=ss.subSet(3, 9);
//		System.out.println(st);
//System.out.println(ss.first());
//System.out.println(ss.last());
		//System.out.println("it give less than from number search"+ss.headSet(3));
		System.out.println("it give grater than equlal from number search"+ss.tailSet(7));
		System.out.println(ss.subSet(1, 9));
	}

}

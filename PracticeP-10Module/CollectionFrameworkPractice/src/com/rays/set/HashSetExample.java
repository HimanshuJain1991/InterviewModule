package com.rays.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet hash=new HashSet();
		hash.add(100);
		hash.add(2);
		hash.add(4);
		hash.add(8);hash.add(3);
		hash.add(222);hash.add(1);
		hash.add(null);
		hash.add(90990);
		System.out.println(hash);
		Set set=new HashSet();
		set.addAll(hash);
		System.out.println(set);
		
		
	}

}

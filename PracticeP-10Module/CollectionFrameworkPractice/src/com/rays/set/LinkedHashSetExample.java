package com.rays.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet ls=new LinkedHashSet();
		ls.add(3);
		ls.add(2);
		ls.add(9);
		ls.add(1);
		ls.add(50000);
		ls.add(5);
		System.out.println(ls);
		Iterator it=ls.iterator();
		  LinkedHashSet set=new LinkedHashSet();
		  Integer in=0;
	  while(it.hasNext()) {
		  in=(Integer) it.next();
		//  System.out.println(in);
	
		  set.add(in);
	  }
	  
	  System.out.println(set);

	}

}

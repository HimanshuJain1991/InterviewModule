package com.rays.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithoutStreamAPI {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(10);
		list.add(6);
		list.add(3);
		list.add(44);
		list.add(33);
		list.add(17);
		System.out.println(list);

		List<Integer> list2 = Arrays.asList(55, 56, 89, 1, 3, 5);
		System.out.println(list2);
		
		List<Integer> list3=new ArrayList<Integer>();
		for (Integer i : list) {
			if(i%2==0) {
				list3.add(i);
			}
			
		}
		
		System.out.println("whole list....."+list);
		System.out.println("after check ........even");
		System.out.println(list3);
	}

}

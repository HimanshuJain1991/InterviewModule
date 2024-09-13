package com.rays.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WithStramExample {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(2);list.add(88);
		list.add(17);list.add(98);list.add(33);
		System.out.println(list);
//		Stream<Integer> stream=list.stream();
//       List<Integer> newList=stream.filter(i->i%2==0).collect(Collectors.toList());
//       System.out.println(newList);
		List<Integer> newList=list.stream().filter(i->i %2==0).collect(Collectors.toList());
		System.out.println(newList);
		
		System.out.println(list.stream().filter(i->i>20).collect(Collectors.toList()));
	}

}

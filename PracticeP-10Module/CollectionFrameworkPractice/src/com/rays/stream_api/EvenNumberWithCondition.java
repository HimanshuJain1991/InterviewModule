package com.rays.stream_api;

import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenNumberWithCondition {

	public static void main(String[] args) {
		List<Integer> list = List.of(2, 4, 3, 6, 72, 13, 17, 10);
		List list3 = list.stream().filter(i -> {
			return i % 2 == 0 && i > 5;
		}).collect(Collectors.toList());
		System.out.println(list3);
		List<String> list1 = List.of("Hello", "Himanshu", "Jain", "Riyansh");
		List<String> prefix = list1.stream().filter(i -> i.startsWith("H")).collect(Collectors.toList());
		System.out.println(prefix);
	}

}

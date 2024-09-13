package com.rays.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodsofStream {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Himanshu", "Riyansh", "Amit", "Lokesh");
		List<String> newList = list.stream().filter(e -> e.startsWith("H")).collect(Collectors.toList());
		System.out.println(newList);

		List<Integer> list1 = Arrays.asList(1, 2, 3, 5, 8, 87);
		System.out.println("map operation perform");
		List<Integer> list2 = list1.stream().map(i -> i * i * i).collect(Collectors.toList());
		System.out.println(list2);

		Integer integer1 = list1.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println("min is" + integer1);

		Integer integer3 = list1.stream().max((x, y) -> x.compareTo(y)).get();
		System.out.println("max is" + integer3);
	}

}

package com.rays.stream_api;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingInStream {

	public static void main(String[] args) {
		List<String> list = List.of("Hello", "Jain", "Hello", "How", "Are");
		System.out.println(list.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting())));

	}

}

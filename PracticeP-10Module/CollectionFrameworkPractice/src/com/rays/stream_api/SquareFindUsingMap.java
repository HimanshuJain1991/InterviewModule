package com.rays.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareFindUsingMap {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(2, 4, 3, 5, 56, 8);
		List<Integer> list = Arrays.asList(1, 3, 2, 66, 7, 5);
		List<Integer> square = list.stream().map((e) -> {
			return e * e;
		}).collect(Collectors.toList());
		System.out.println("square is= " + square);

	}

}

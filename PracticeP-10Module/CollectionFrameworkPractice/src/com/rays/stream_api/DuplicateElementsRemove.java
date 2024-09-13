package com.rays.stream_api;

import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElementsRemove {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 4, 5);
		List<Integer> duplicate = list.stream().distinct().collect(Collectors.toList());
		System.out.println(duplicate);
	}

}

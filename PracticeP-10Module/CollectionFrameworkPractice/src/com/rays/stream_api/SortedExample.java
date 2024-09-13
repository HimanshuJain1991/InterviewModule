package com.rays.stream_api;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedExample {

	public static void main(String[] args) {
		//mistake hai program hai
		List<Integer> list = List.of(1, 2, 3, 65, 26, 22);
		List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list1);

		Random random = new Random();
		Stream<Integer> r = Stream.generate(random::nextInt);
		Stream var = r.limit(5L);
		Iterator<Integer> it = var.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

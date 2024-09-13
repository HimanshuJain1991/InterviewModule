package com.rays.stream_api;

import java.util.List;

public class SkipAndLimitMethod {

	public static void main(String[] args) {
	List<Integer> list=List.of(1,2,3,4,5,6,7,8,9,10);
	list.stream().skip(1).limit(7).forEach(any->{
		System.out.print(any);
	});

	}

}

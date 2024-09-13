package com.rays.stream_api;

import java.util.stream.Stream;

public class CreateStreamObject {

	public static void main(String[] args) {
		Stream<Object> emptyStream = Stream.empty();
		emptyStream.forEach(e -> {
			System.out.println(e);
		});
		
		String names[]= {"Himanshu","Durgesh","Riyansh","Anup"};
		Stream<String> stream1=Stream.of(names);
		stream1.forEach(e->{
			System.out.println(e);
		});

	}

}

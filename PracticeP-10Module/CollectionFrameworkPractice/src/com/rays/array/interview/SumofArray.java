package com.rays.array.interview;

public class SumofArray {

	public static void main(String[] args) {
		float sum=0;
		float []marks= {3.4f,55.6f,88.7f,65.66f,4.6f};
		for(int i=0;i<marks.length;i++) {
			sum=sum+marks[i];
		}
		System.out.println(sum);

	}

}

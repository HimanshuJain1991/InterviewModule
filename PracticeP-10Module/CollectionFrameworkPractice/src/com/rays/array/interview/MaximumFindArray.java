package com.rays.array.interview;

public class MaximumFindArray {

	public static void main(String[] args) {
		int arr[] = { 1, 45, 6888, 988880, 3 };
		int maximum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maximum) {
				maximum = arr[i];
			}
		}
		System.out.println("Maximum number is: " + maximum);
	}
}

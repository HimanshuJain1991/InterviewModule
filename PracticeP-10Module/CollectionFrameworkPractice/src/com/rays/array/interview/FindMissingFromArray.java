package com.rays.array.interview;

public class FindMissingFromArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6 };
		int expectedNoOfElement = arr.length + 1;
		int totalSum = expectedNoOfElement * (expectedNoOfElement + 1) / 2, sum = 0;
		System.out.println("total sum is=" + totalSum);
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Missing Number is:= " + (totalSum - sum));

	}

}

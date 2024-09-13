package com.rays.array.interview;

public class SecondSmallestElement {

	public static void main(String[] args) {
		int arr[] = { 30, 40, 3, 2, 6, 7, 80 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		System.out.println("Second  smmalest = "+arr[5]);

	}

}

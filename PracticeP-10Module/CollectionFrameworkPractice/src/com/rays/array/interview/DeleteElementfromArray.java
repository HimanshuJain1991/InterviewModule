package com.rays.array.interview;

public class DeleteElementfromArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60 };
		int deleteEle = 30;
		for (int i = 0; i < arr.length; i++) {
			if (deleteEle == arr[i]) {
				for (int j = i; j < arr.length - 1; j++) {
					arr[j] = arr[j + 1];
				}
				break;
			}
		}
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}

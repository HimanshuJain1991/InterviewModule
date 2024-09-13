package com.rays.array.interview;

public class MinimumFindArray {

	public static void main(String[] args) {
		int arr[] = { 12, 42, 3, 4, 5 };
		int min = Integer.MAX_VALUE;
		System.out.println(min);
		for (int i : arr) {
			if (i < min) {
				min = i;
			}
		}
		System.out.println("Minimum is: " + min);

//		int arr[]= {22,2,3,6,7,8};
//		int min=Integer.MAX_VALUE;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//		}
//		

		// System.out.println(min);

	}

}

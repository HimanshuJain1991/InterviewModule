package com.rays.array.interview;

import java.util.Arrays;

public class SecondLargestArrayElement {

	public static void main(String[] args) {
		int arr[]= {1,3,2,5,4,79,78,30};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
//		for (int i : arr) {
//			System.out.print(Arrays.toString(arr)+" ");
//		}
System.out.println("second largest element= "+arr[1]);
	}


}

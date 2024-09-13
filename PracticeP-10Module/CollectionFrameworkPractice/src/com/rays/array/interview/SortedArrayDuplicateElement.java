package com.rays.array.interview;

public class SortedArrayDuplicateElement {

	public static void main(String[] args) {
		int arr[]= {1,2,2,3,4,5,5};
		int temp[]=new int [arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j]=arr[arr.length-1];
	for (int i : temp) {
		if(i!=0)
		System.out.print(i);
	}
		
		

	}

}

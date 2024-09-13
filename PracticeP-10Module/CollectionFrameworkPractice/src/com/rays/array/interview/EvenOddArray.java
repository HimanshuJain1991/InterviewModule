package com.rays.array.interview;

import java.util.ArrayList;
import java.util.List;

public class EvenOddArray {

	public static void main(String[] args) {
		int arr[] = { 2, 6, 10, 4, 3, 17, 23, 87, 7 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				//System.out.print(arr[i] + " ");
				List list=new ArrayList();
				list.add(arr[i]);
				System.out.print(list);
			} else {
				System.out.println(arr[i] + " ");
			}
		}

	}

}

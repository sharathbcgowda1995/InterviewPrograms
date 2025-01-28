package com.java.advanced.programming;

import java.util.Iterator;

public class ThirdLargestNumber {

	public static int findThirdLargestNumber(int[] arr) {

		for (int i = 0; i < arr.length-1 ; i++) {

			for (int j = 0 ; j < arr.length - 1 ; j++) {

				if (arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}

			}
		}

		for(int i : arr) {
			System.out.println(i);
		}
		return arr[2];

	}

	public static void main(String[] args) {
		int[] arr =  {1,4,5,3,2};

		System.out.println(findThirdLargestNumber(arr));

	}

}

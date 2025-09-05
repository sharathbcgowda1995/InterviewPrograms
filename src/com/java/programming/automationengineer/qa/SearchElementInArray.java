package com.java.programming.automationengineer.qa;
import java.util.Arrays;

public class SearchElementInArray {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 56 };

		int searchElement = 30;
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == searchElement) {
				System.out.println("Array element is present at " + i);
				flag = true;
				break;
			}
		}

		if (flag == false) {
			System.out.println("Element not found");
		}
		
		System.out.println("Array element is present in : " + Arrays.binarySearch(arr, 30));

	}

}

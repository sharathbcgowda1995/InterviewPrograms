package com.java.advanced.programming.automationengineer.Duplicates;

public class EvenAndOddNumInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println("Even numbers are : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}

		System.out.println("Even numbers are : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}

		}
	}
}

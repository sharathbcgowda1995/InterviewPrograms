package com.java.programming;

public class SumOfConsecutiveElements {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 7, 8 };

		SumOfConsecutiveElements.sumOfConsecutiveTwoNumbers(arr);

		SumOfConsecutiveElements.sumOfConsecutiveFourNumbers(arr);

	}

	public static void sumOfConsecutiveTwoNumbers(int[] arr) {
		int sum = 0;

		// here we are using +1 -- to limit the pointer go to the 5th element the asking
		// for 6th element
		System.out.println("Sum of consecutive two array elements are : ");
		for (int i = 0; i + 1 < arr.length; i++) {

			sum = arr[i] + arr[i + 1];
			System.out.println(sum + " ");
		}
	}

	public static void sumOfConsecutiveFourNumbers(int[] arr) {
		int sum = 0;
		// here we are using +1 -- to limit the pointer go to the 5th element the asking
		// for 6th element
		System.out.println("Sum of consecutive four array elements are : ");
		for (int i = 0; i + 3 < arr.length; i++) {

			sum = arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3];
			System.out.println(sum + " ");
		}
	}

	// we can also implement the sum of the array consecutive element is
	// specifically equal to some values what are those ?
}

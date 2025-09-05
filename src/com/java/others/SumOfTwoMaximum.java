package com.java.others;

public class SumOfTwoMaximum {

	public static void main(String[] args) {

		int[] arr = { 2, 43, 22, 44, 32, 56, 780, 23, 4, 12, 0, 789, 1 };

		int sum = 0;

		int sum2 = 0;

		int[] arr2 = new int[arr.length];

		int max = 0;

		for (int i = 0; i + 1 < arr.length; i++) {
			sum = arr[i] + arr[i + 1];
			arr2[i] = sum;

		}

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] > max) {
				max = arr2[i];
			}
		}

		System.out.println("Maximum value is : " + max);

		for (int i = 0; i + 1 < arr.length; i++) {
			sum2 = arr[i] + arr[i + 1];
			if (sum2 == max) {
				System.out.println("Indexes are : " + i + (i + 1));
			}
		}
	}

}

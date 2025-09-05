package com.java.programming.automationengineer.Duplicates;

public class MaxAndMinAnArray {

	public static void main(String[] args) {

		int[] arr = { 12, 56, 71, 86, 98, 1000 };

		int max = arr[0];
		int min = arr[0];

		// as I have initialised oth index to min and max value, for loop is from 1st
		// index
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum number is : " + max);

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("minimum number is : " + min);

	}

}

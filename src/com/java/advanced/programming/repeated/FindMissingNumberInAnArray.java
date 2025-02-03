package com.java.advanced.programming.repeated;

public class FindMissingNumberInAnArray {

	public static void main(String[] args) {

		int[] existingArray = { 1, 3, 4, 5, 6 };

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < existingArray.length; i++) {
			sum1 += existingArray[i];
		}
		System.out.println("Sum of the existing array : " + sum1);
		

		for (int i = 0; i <= 6; i++) {
			sum2 += i;
		}
		System.out.println("Sum till the last array digit is : " + sum2);
		

		int missingNumber = sum2 - sum1;
		System.out.println("Missed number in an array is : " + missingNumber);

	}

}

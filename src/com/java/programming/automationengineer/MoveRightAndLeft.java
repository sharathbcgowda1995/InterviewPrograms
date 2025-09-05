package com.java.programming.automationengineer;

public class MoveRightAndLeft {

	public static void evenRightAndOddLeft(int[] arr) {
		int left = 0;
		int right = arr.length-1;

		while (left<right) {

			if(arr[left] % 2 != 0) {
				left++;
			}else if(arr [right]%2 == 0) {
				right--;
			}else{

				int temp = arr[left];
				arr[left]= arr[right];
				arr[right]= temp;
				left++;
				right--;
			}
		}

		for (int i : arr) {

			System.out.print(i + " ");

		}
	}

	public static void zeroRightAndOnesLeft(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		while (left<right) {

			if(arr[left] == 1) {
				left++;
			}else if(arr [right] == 0) {
				right--;
			}else{

				int temp = arr[left];
				arr[left]= arr[right];
				arr[right]= temp;
				left++;
				right--;
			}
		}

		for (int i : arr) {

			System.out.print(i + " ");

		}
	}

	public static void main(String[] args) {
		int[] evenOdd = {1,2,3,4,5,67,8,9,0,10};
		int[] zeroesOnes = {1,1,0,1,0,1,0};
		MoveRightAndLeft.evenRightAndOddLeft(zeroesOnes);
	}

}

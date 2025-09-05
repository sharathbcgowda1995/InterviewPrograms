package com.java.programming.automationengineer;
import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 2, 6, 7 };

		System.out.println("Arrays before bubble sort : " + Arrays.toString(arr));
		// Meth-11 .parallelSort also we can use
		/*Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));*/

		//Meth-2
		// for passes, i <= arr.length - 1 is also posiible
		for (int i = 0; i < arr.length - 1; i++) {
			// for iteration
			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Arrays after bubble sort : " + Arrays.toString(arr));

	}

}

/* 1. take the sorted array take start and end element of an array to compare all these values present or 
 * or not in the given array and initialise thsese values to the for loop variable
 * 2.Inner loop should start from the 0th index till it's length-1.
 * 3. with the help of flag print the missing elements once inner loop completely executed. 
 * -*/

package com.java.advanced.programming;

public class FindMissingNumbers {

	public static void findMissingNumbers(int[] arr) {

		for(int i = arr[0]; i <= arr[arr.length-1] ;i++) {


			boolean flag = false;

			for (int j=0; j< arr.length ; j++ ) {
				if (arr[j] == i) {
					flag = true;
				}
			}

			if (flag == false) {
				System.out.println("Missing number is : "+ i);
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = {1,2,4,6};
		findMissingNumbers(arr);
	}

}

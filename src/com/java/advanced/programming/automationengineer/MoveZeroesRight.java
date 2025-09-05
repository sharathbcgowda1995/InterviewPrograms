/* 1. First take counter take an array and then iterate with the for each loop and if the element is != 0 then
 *  increment the counter and add that value to that counter value. else if 0 found and do nothing. 
 *  perform it for whole iteration.
 *  
 * 2. Take while loop when the 0's found we haven't updated the counter so with while loop increment counter untill it
 * reached the length of the array and during each count increment add the zeroes.
 * 
 */

package com.java.advanced.programming.automationengineer;

public class MoveZeroesRight {


	public static void moveTofLeft(int[] arr) {

		int counter = 0;

		for (int i : arr) {
			if (i != 0) {
				arr[counter] = i;
				counter++;
				//arr[counter++] = i;
			}
		}

		while(counter< arr.length) {

			arr[counter] = 0;
			counter++;
			//arr[counter++] = 0;

		}

		for (int i : arr) {
			System.out.println(i);
		}

	}


	public static void main(String[] args) {

		int[] array_values = {0,1,2,0,3,4};
		MoveZeroesRight.moveTofLeft(array_values);


	}


}

package com.java.programming.automationengineer.qa;
import java.util.Arrays;

public class ArraysAreEqual {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4 };

		int[] arr2 = { 1, 2, 3, 4 };

		// Meth1
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Two arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}

		// Meth2-compare all the elements of the array using for loop,take one boolean
		// variable(initially true) inside the loop if that become false then not equal

	}

}

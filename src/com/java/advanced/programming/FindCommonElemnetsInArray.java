package com.java.advanced.programming;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElemnetsInArray {
	public static Set<Integer> findCommonElements(int[] arr1, int[] arr2) {
		// Create sets for both arrays
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> commonElements = new HashSet<>();

		// Add elements of arr1 to set1
		for (int num : arr1) {
			set1.add(num);
		}

		// Check if elements of arr2 are in set1
		for (int num : arr2) {
			if (set1.contains(num)) {
				commonElements.add(num);
			}
		}

		return commonElements;
	}

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {4, 5, 6, 7, 8};

		Set<Integer> result = findCommonElements(arr1, arr2);
		System.out.println("Common elements: " + result);  // Output: [4, 5]
	}
}

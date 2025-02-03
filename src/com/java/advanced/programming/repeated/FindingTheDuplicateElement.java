package com.java.advanced.programming.repeated;

import java.util.HashSet;
import java.util.TreeSet;

public class FindingTheDuplicateElement {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 1, 2 };

		TreeSet<Integer> sortedSet = new TreeSet<Integer>();

		HashSet<Integer> dupSet = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (sortedSet.add(arr[i]) == false) {
				dupSet.add(arr[i]);
			}
		}

		// Duplicate elements
		System.out.println("Duplicate elements are : ");
		for (Integer integer : dupSet) {
			System.out.println(integer);
		}

		// Unique elements with sorting.
		System.out.println("unique-sorted elements are : ");
		for (Integer integer : sortedSet) {
			System.out.println(integer);
		}
	}

}

package com.java.programming.automationengineer.qa;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {

	public static void removeDuplicates(int[] arr) {

		Set<Integer> set = new HashSet<Integer>();

		for (int values : arr) {

			set.add(values);

		}
		
		for (Integer integer : set) {

			System.out.println(integer);

		}
	}

	public static void main(String[] args) {
		int[] arr = {1,22,22,33,44,44,54,67,87};
		removeDuplicates(arr);
	}

}

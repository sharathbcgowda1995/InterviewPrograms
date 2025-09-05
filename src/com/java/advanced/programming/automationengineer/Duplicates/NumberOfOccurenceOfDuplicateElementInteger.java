package com.java.advanced.programming.automationengineer.Duplicates;

import java.util.HashMap;

public class NumberOfOccurenceOfDuplicateElementInteger {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 1, 2 };

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			} else {
				map.put(arr[i], 1);
			}
		}

		System.out.println(map);

	}

}

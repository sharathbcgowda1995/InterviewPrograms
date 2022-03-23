package com.java.programming;
import java.util.Arrays;
import java.util.Collections;

public class SortUsingBuiltInMethods {

	public static void main(String[] args) {

		int[] a = { 10, 200, 30, 40, 80 };

		System.out.println("Array elements before sorting : " + Arrays.toString(a));

		// BuiltInMeth-1 --It executes if elements are more than 8192 orelse it uses
		// default sort()
		// Arrays.parallelSort(a);

		// BuiltIn Meth-2
		Arrays.sort(a);
		System.out.println("Array elements After sorting : " + Arrays.toString(a));

		// Descending order , Here we can't use the int as collection don't support
		Integer[] b = { 10, 50, 20, 30, 40 };
		Arrays.sort(b, Collections.reverseOrder());
		System.out.println("Descending Order : " + Arrays.toString(b));

	}

}

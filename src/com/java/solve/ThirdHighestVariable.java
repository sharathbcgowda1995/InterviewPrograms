package com.java.solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdHighestVariable {

	public static void main(String[] args) {

		int[] arr = { 23, 24, 67, 78, 9, 10 };

		int max = arr[0];
		int max2 = arr[0];
		int max3 = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {

				max = arr[i];

			}
			for (int j = 0; j < arr.length; j++) {
				if (max == arr[j]) {

				} else {
					if (arr[j] > max2) {

						max2 = arr[j];

					}
				}
			}

			for (int k = 0; k < arr.length; k++) {
				if ((max == arr[k]) || (max2 == arr[k])) {

				} else {
					if (arr[k] > max2) {

						max3 = arr[k];

					}
				}
			}

		}

		System.out.println(max);
		System.out.println(max2);
		System.out.println(max3);

		// ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));

//		List<Integer> list = arr.stream().foreacch(s->System.out.println(s)).sorted().distinct().collect(Collectors.toList());
//
//		System.out.println(list.get(3));

	}

}

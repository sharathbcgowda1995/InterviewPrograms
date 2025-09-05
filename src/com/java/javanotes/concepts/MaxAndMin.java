package com.java.javanotes.concepts;

import java.util.ArrayList;
import java.util.List;

public class MaxAndMin {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(70);
		list.add(30);
		list.add(80);

		int var_min = list.get(0);
		int var_max = list.get(0);

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) < var_min) {
				var_min = list.get(i);
			}

			if (list.get(i) > var_max) {
				var_max = list.get(i);
			}

		}

		System.out.println("smallest number is : " + var_min);
		System.out.println("Biggest number in a list of numbers is : " + var_max);
	}

}

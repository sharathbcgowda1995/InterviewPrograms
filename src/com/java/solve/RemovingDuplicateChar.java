package com.java.solve;

import java.util.HashSet;

public class RemovingDuplicateChar {

	public static void main(String[] args) {

		String name = "Sharath";

		char[] name2 = name.toCharArray();

		String filteredName = "";

		HashSet<Character> set = new HashSet<Character>();

		for (int i = 0; i < name.length(); i++) {
			if (set.add(name2[i]) == true) {
				filteredName = filteredName + name2[i];
			}
		}
		System.out.println(filteredName);
	}

}

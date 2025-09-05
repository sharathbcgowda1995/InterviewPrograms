package com.java.programming.LeetCode;

import java.util.ArrayList;

public class FindSubstring {

	public static void findTheSubStrings(String value) {

		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < value.length(); i++) {

			// Here we have to exclusively has to go till the last character hence the loop goes till the last element with < =
			for (int j = i+ 1; j <= value.length(); j++) {

				list.add(value.substring(i,j));

			}
		}

		for (String string : list) {
			System.out.println(string);
		}

	}

	public static void main(String[] args) {

		String combination = "ABC";

		FindSubstring.findTheSubStrings(combination);

	}

}

package com.java.programming.automationengineer.Duplicates;

import java.util.TreeMap;

public class OccurenceOfWordsInAString {

	public static void main(String[] args) {

		String word = "Sharath is Sharath only Nagshree is Nagshree only ok got it";

		String[] strArray = word.split("\\s");

		TreeMap<String, Integer> map = new TreeMap<String, Integer>();

		for (String string : strArray) {
			if (map.containsKey(string)) {
				map.put(string, map.get(string) + 1);
			} else {
				map.put(string, 1);
			}
		}
		System.out.println(map);
	}

}

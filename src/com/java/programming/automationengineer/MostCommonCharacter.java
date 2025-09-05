package com.java.programming.automationengineer;

import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {

	public static char findCommonCharacter(String word) {

		char[] arr = word.toCharArray();

		HashMap<Character,Integer> map = new HashMap<>();

		for (char c : arr) {

			if(map.containsKey(c)) {
				map.put(c, map.get(c) +1);
			}else {
				map.put(c, 1);
			}

		}

		int maximumValue = 0;
		char maxOccuredString = '\0';

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maximumValue) {

				maxOccuredString = entry.getKey();
				maximumValue = entry.getValue();

			}
		}
		
		return maxOccuredString;

	}

	public static void main(String[] args) {
		String word = "Hello world";
		System.out.println(MostCommonCharacter.findCommonCharacter(word));
	}

}

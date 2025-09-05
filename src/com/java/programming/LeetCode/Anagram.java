package com.java.programming.LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

	public static boolean isAngram(String str1, String str2) {

		str1 = str1.replaceAll(" ","").toLowerCase();

		str2 = str2.replaceAll(" ","").toLowerCase();

		if (str1.length() != str2.length()) {

			return false;

		} else {

			char[] arr1 = str1.toCharArray();

			char[] arr2 = str2.toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			return Arrays.equals(arr1, arr2);
		}

	}

	public static boolean isAngramUsingMap(String str1, String str2) {

		str1 = str1.replaceAll(" ","").toLowerCase();

		str2 = str2.replaceAll(" ","").toLowerCase();

		if (str1.length() != str2.length()) {

			return false;

		} else {

			HashMap<Character,Integer> map = new HashMap<>();

			char[] arr1= str1.toCharArray();

			for (char character : arr1) {
				if(!map.containsKey(character)) {
					map.put(character, 1);
				}else {
					map.put(character, map.get(character)+1);
				}
			}

			System.out.println(map);

			HashMap<Character,Integer> map2 = new HashMap<>();

			char[] arr2= str2.toCharArray();

			for (char character : arr2) {
				if(!map2.containsKey(character)) {
					map2.put(character, 1);
				}else {
					map2.put(character, map2.get(character)+1);
				}
			}

			System.out.println(map);

			if(map.equals(map2)) {
				return true;
			}else {
				return false;
			}
		}

	}

	public static void main(String[] args) {

		String str1 = "Listen";

		String str2 = "Silent";

		//First method
		boolean flag = isAngram(str1, str2);

		if (flag == true) {
			System.out.println("Both are anagram words");
		} else {
			System.out.println("Both are not anagram words");
		}


		// second method
		boolean flag2 = isAngramUsingMap(str1, str2);

		if (flag2 == true) {
			System.out.println("Both are anagram words");
		} else {
			System.out.println("Both are not anagram words");
		}

	}

}

package com.java.programming;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static boolean isAngram(String str1, String str2) {

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

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first String : ");
		String str1 = sc.nextLine();

		System.out.println("Enter Second String : ");
		String str2 = sc.nextLine();

		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		boolean flag = isAngram(str1, str2);

		if (flag == true) {
			System.out.println("Both are anagram words");
		} else {
			System.out.println("Both are not anagram words");
		}

	}

}

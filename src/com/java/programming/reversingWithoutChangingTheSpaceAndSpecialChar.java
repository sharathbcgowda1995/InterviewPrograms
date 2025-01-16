package com.java.programming;

public class reversingWithoutChangingTheSpaceAndSpecialChar {

	public static void main(String[] args) {

		String word = " Sharath BC Gowda !";

		char[] charArr = word.toCharArray();

		int start = 0;

		int end = word.length() - 1;

		while (start < end) {
			if (!Character.isAlphabetic(charArr[start])) {
				start++;
			} else if (!Character.isAlphabetic(charArr[end])) {
				end--;
			} else {
				char temp = charArr[start];
				charArr[start] = charArr[end];
				charArr[end] = temp;
				start++;
				end--;
			}

		}

		String reversed = new String(charArr);

		System.out.println(reversed);

	}
}

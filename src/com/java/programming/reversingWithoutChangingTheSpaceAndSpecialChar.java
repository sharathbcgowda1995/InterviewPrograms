package com.java.programming;

public class reversingWithoutChangingTheSpaceAndSpecialChar {

	public static void main(String[] args) {

		String word = " Sharath BC Gowda";

		char[] charArr = word.toCharArray();

		int i = 0;

		int j = word.length() - 1;

		while (i < j) {
			if (!Character.isAlphabetic(charArr[i])) {
				i++;
			} else if (!Character.isAlphabetic(charArr[j])) {
				j--;
			} else {
				char temp = charArr[i];
				charArr[i] = charArr[j];
				charArr[j] = temp;
				i++;
				j--;
			}

		}

		String reversed = new String(charArr);

		System.out.println(reversed);

	}
}

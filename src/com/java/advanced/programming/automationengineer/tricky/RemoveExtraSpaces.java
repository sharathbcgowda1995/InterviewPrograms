package com.java.advanced.programming.automationengineer.tricky;

public class RemoveExtraSpaces {

	public static void main(String[] args) {

		String word = "    SSSD   E  T   AUTO M TION   ";

		String trimmedWord = word.trim();

		String replace = "";

		char[] charArr = trimmedWord.toCharArray();

		char previousChar = ' ';

		for (int i = 0; i < charArr.length; i++) {
			if ((previousChar == charArr[i]) && (previousChar == ' ')) {

				// Don't perform anything

			} else {
				replace += charArr[i];
				previousChar = charArr[i];
			}
		}

		System.out.println(replace);

	}

}

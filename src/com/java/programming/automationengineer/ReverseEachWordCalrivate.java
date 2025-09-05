package com.java.programming.automationengineer;

public class ReverseEachWordCalrivate {

	public static void main(String[] args) {
		String word = "My name is Sharath";

		String[] strArray = word.split("\\s");

		String finalReversedWord = "";

		for (int i = 0; i < strArray.length; i++) {

			String reversed = "";
			String temp = strArray[i];

			char[] insideStr = temp.toCharArray();

			for (int j = insideStr.length - 1; j >= 0; j--) {

				reversed = reversed + insideStr[j];
			}

			finalReversedWord = finalReversedWord + reversed + " ";
		}

		System.out.println(finalReversedWord);
	}

}

package com.java.programming;

public class RemoveConsecutiveChar {

	public static void main(String[] args) {

		String word = "Commmmputputerere";

		char[] wordArray = word.toCharArray();

		char previousChar = ' ';

		String newWord = "";

		for (int i = 0; i < wordArray.length; i++) {
			if (previousChar != wordArray[i]) {
				newWord = newWord + wordArray[i];
				previousChar = wordArray[i];
			}
		}

		System.out.println(newWord);
	}

}

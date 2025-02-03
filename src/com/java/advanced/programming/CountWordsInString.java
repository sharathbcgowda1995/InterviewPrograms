package com.java.advanced.programming;

public class CountWordsInString {

	public static void main(String[] args) {
		String s = "Sharath B C Gowda ";

		int count = 1;

		//By checking the space
		for (int i = 0; i < s.length()-1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {

				count++;

			}
		}

		System.out.println("The total number of words are : " + count);

	}

}

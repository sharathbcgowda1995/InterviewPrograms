package com.java.javanotes.concepts;

public class ReversingEachWord {

	public static void main(String[] args) {

		String word = "Welcome to InterTrust";

		String splittedArray[] = word.split(" ");

		for (String string : splittedArray) {
			System.out.println(string);
		}

		String finalWord = "";

		String reversedWord = "";

		for (int i = 0; i < splittedArray.length; i++) {

			String n = splittedArray[i];
			for (int j = n.length() - 1; j >= 0; j--) {
				reversedWord = reversedWord + n.charAt(j);
			}

			finalWord = reversedWord + " ";

		}

		System.out.println(finalWord);

	}

}

//StringBuffer sb = new StringBuffer(splittedArray[i]);
//sb.reverse();
//reversedWord = reversedWord + sb.toString() + " ";
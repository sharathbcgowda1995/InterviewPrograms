package com.java.programming;
import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {

		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		int count = 1;

		//By checking the space
		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {

				++count;

			}
		}

		System.out.println("The total number of words are : " + count);

	}

}

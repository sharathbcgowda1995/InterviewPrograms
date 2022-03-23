package com.java.programming;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether the number is palindrome or not :");
		int number = sc.nextInt();

		int originalNumber = number;

		int rev = 0;

		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}

		System.out.println("Reversed number is :" + rev);

		if (originalNumber == rev) {
			System.out.println(originalNumber + " is a palindrome number");
		} else {
			System.out.println(originalNumber + " is not a palindrome number");
		}

	}

}

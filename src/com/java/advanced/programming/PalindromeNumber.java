package com.java.advanced.programming;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether the number is palindrome or not :");
		int number = sc.nextInt();

		int originalNumber = number;

		int reversed_number = 0;

		int digit ;

		while (number != 0) {
			digit = number % 10;
			reversed_number = reversed_number * 10 + digit;
			number = number / 10;
		}

		System.out.println("Reversed number is :" + reversed_number);

		if (originalNumber == reversed_number) {
			System.out.println(originalNumber + " is a palindrome number");
		} else {
			System.out.println(originalNumber + " is not a palindrome number");
		}

	}

}

package com.java.programming;
import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number : ");
		int first = sc.nextInt();

		System.out.println("Enter the second number : ");
		int second = sc.nextInt();

		System.out.println("Enter the third number : ");
		int third = sc.nextInt();

		// using if also we can do (first>second && first && third) -----

		// using ternary operator

		int largest1 = first > second ? first : second;
		int largest2 = third > largest1 ? third : largest1;

		System.out.println("Largest number is : " + largest2);

	}

}

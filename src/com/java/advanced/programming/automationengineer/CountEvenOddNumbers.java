package com.java.advanced.programming.automationengineer;
import java.util.Scanner;

public class CountEvenOddNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = sc.nextInt();

		int digit = 0;
		int evenCount = 0;
		int oddCount = 0;

		while (number > 0) {
			digit = number % 10;

			if (digit % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			
			number= number/10;
		}
		System.out.println("Even number count is : " + evenCount);
		System.out.println("Odd count is : " + oddCount);
	}

}

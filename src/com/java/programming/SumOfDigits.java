package com.java.programming;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBERS TO SUM : ");
		int numbers = sc.nextInt();

		int sum = 0;

		while (numbers != 0) {
			int digit =  numbers%10;
			sum = sum + digit;
			numbers=numbers/10;
		}

		System.out.println("Sum of the enetered number is : " + sum);
	}

}

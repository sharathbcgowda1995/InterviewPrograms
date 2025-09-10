package com.java.programming.automationengineer;

public class RecursionWithFactorial {

	private static int findFactorial(int number) {

		if (number == 1 || number ==0 ) {

			return 1;
		}

		return number * findFactorial(number - 1);

	}

	public static void main(String[] args) {

		int number = 5;

		System.out.println(RecursionWithFactorial.findFactorial(number));

	}

}

package com.java.advanced.programming.automationengineer;

public class Swapping2Numbers {

	public static void main(String[] args) {

		int a = 10, b = 20;

		System.out.println("Before swapping the values are....." + a + " " + b);

		// Third variable
		/*
		 * int t = a;
		 * 
		 * a = b; b = t;
		 */

		// + and - operator
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Before swapping the values are....." + a + " " + b);

	}

}

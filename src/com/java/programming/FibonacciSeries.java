package com.java.programming;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n1 = 0, n2 = 1, sum;
		
		System.out.print("Fibonacci series is : " + n1 + " " + n2);

		for (int i = 2; i < 10; i++) {
			sum = n1 + n2;
			System.out.print(" " + sum);
			n1 = n2;
			n2 = sum;
		}
	}

}

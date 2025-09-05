package com.java.programming.automationengineer;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int factorial = 1;
		
		for (int i=1 ; i<=number ; i++) {
			factorial = factorial * i ;
		}

		System.out.println("Factorial of number "+ number + " is : "  + factorial);
	}

}

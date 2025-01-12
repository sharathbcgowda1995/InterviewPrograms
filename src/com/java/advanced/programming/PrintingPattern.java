package com.java.advanced.programming;

import java.util.Scanner;

public class PrintingPattern {

	public static void printThePattern(int rows) {

		for (int i =0; i<= rows ;i++ ) {

			for (int j =0; j <= i;j++ ) {

				System.out.print("*");

			}

			System.out.println();

		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();

		printThePattern(rows);
		
		scanner.close();

	}

}

package com.java.advanced.programming;

import java.util.ArrayList;

public class FindSingleDigit {


	public static int findSum(int number) {
		int sum = 0;

		while(number != 0) {
			sum =  sum+(number%10);
			number = number/10;
		}

		return sum;
	}

	public static void main(String[] args) {

		int num = 889;

		int sum = findSum(num);

		while(sum>10) {

			sum = findSum(sum);

		}
		System.out.println(sum);

	}

}

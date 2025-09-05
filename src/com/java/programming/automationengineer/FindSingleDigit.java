package com.java.programming.automationengineer;

public class FindSingleDigit {


	public static int findSum(int number) {
		int sum = 0;
		int digit =0;

		while(number > 0) {
			digit = (number%10);
			sum =  sum + digit;
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

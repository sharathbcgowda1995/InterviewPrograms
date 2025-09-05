package com.java.advanced.programming.automationengineer.qa;

public class AverageOfPrimeNumbers {

	public static int totalSum ; 

	public static int totalElements = 0 ; 

	public static boolean findPrimeNumber(int num) {

		int count = 0;

		if (num <= 1) {
			return false;
		}else {

			for(int j = 1;j <=num ;j++) {
				if(num%j==0) {
					count++;
				}
			}
		}

		if (count <= 2) {
			System.out.println(num);
			return true;
		}else{
			return false;
		}
	}


	public static double findAverage(int sum, int totalElements) {
		return (double) sum/totalElements;
	}


	public static double findAvergaeOfPrimeNumbers(int[] arr) {

		for (int i : arr) {
			if (findPrimeNumber(i)) {
				totalSum = totalSum + i;
				totalElements++;
			}
		}
		return findAverage(totalSum,totalElements);
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,23,12,233};
		System.out.println(findAvergaeOfPrimeNumbers(arr));
	}

}

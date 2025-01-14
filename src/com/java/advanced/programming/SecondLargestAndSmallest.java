package com.java.advanced.programming;

public class SecondLargestAndSmallest {

	public static void findLargestSmallest(int[] elements) {

		int firstLargest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
		int firstSmallest = Integer.MAX_VALUE,secondSmallest = Integer.MAX_VALUE;

		if (elements == null || elements.length < 2) {
			System.out.println("Array must have at least 2 elements.");
			return;
		}else {

			for (int i : elements) {

				//Find 2nd Largest
				if(i > firstLargest) {
					secondLargest = firstLargest;
					firstLargest = i;
				} else if (i > secondLargest && i != firstLargest) {
					secondLargest = i;
				}

				//Find 2nd Smallest
				if(i < firstSmallest) {
					secondSmallest = firstSmallest;
					firstSmallest = i;
				} else if (i < secondSmallest && i != firstSmallest) {
					secondSmallest = i;
				}
			}

			System.out.println("second Largest is " + secondLargest + " and "+ "second smallest is "+ secondSmallest);

		}
	}

	public static void main(String[] args) {

		int[] elements = {1,2,3,4,5};
		findLargestSmallest(elements);

	}

}

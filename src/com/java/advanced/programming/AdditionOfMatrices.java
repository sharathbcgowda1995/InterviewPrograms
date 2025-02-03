package com.java.advanced.programming;

public class AdditionOfMatrices {

	public static void main(String[] args) {
		
		//2-rows,3-columns
		//arr1+arr2
		int[][] arr1 = {{1,2,3},
						{4,5,6}};
		
		int[][] arr2 = {{1,2,3},
						{4,5,6}};
		
		int[][] resultedArr = {{0,0,0},
							   {0,0,0}};
		
		//System.out.println(arr1.length);
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				resultedArr[i][j] = arr1[i][j]+arr2[i][j];
				System.out.print(resultedArr[i][j] + " ");
			} 
			System.out.println("");
		}

	}

}

package com.java.concepts;

public class Interview {

	public static void main(String[] args) {

		String duplicate = "Sharath";
		char[] du = duplicate.toCharArray();

		System.out.println(du);

		for (int i = 0; i < du.length; i++) {

			for (int j = 1 + i; j < du.length; j++) {
				if (du[i] == du[j]) {
					System.out.println("Duplicate element found : " + du[i]);
				}
			}

		}

//		for (int i = 0; i < duplicate.length() - 1; i++) {
//			for (int j = 1+i; j < duplicate.length() - 1; j++) {
//				if (duplicate.charAt(i) == duplicate.charAt(j)) {
//					System.out.println("Duplicate element is " + duplicate.charAt(i));
//				}
//			}
//		}
	}

}

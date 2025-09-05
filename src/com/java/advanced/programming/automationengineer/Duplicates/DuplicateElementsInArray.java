package com.java.advanced.programming.automationengineer.Duplicates;
import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		String techLanguages[] = { "Java", "Python", "Ruby", "Java", "Python" };
		boolean flag = true;

		/* Meth-1 */
//		for (int i = 0; i < techLanguages.length; i++) {
//			for (int j = i + 1; j < techLanguages.length; j++) {
//				if (techLanguages[i] == techLanguages[j]) {
//					System.out.println("Found the duplicate element : " + techLanguages[i] + " On index number : " + j);
//					flag = true;
//				}
//			}
//		}
//		if (flag == false) {
//			System.out.println("No duplicate elements found");
//		}

		/* using HashSet */
		HashSet<String> hs = new HashSet<String>();
		for (String lang : techLanguages) {
			if (hs.add(lang) == false) {
				System.out.println("Duplicate element found : " + lang);
				flag = true;
			}
		}

		if (flag == false) {
			System.out.println("No duplicate elements found");
		}

	}

}

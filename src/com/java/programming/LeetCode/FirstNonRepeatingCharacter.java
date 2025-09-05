/* Here we have to identify which is the first non-repeating character so we have take first element and except that index 
 * 1. we have iterate over all the index and check is there any repetition if yes break check for next element. hence take two loops
 * 2. If we find the first non-reptitive element then break the outer most loop as well.
 * */

package com.java.programming.LeetCode;

public class FirstNonRepeatingCharacter {

	public static void FirstNonRepeatingCharacter(String name) {

		for(int i =0;i < name.length();i++) {

			boolean unique = true;

			for(int j=0; j< name.length();j++) {

				if(i!=j && name.charAt(i)==name.charAt(j)) {

					unique = false;
					break;

				}
			}

			if (unique) {
				System.out.print("First non repeating char is : " + name.charAt(i));
			}
		}

	}
	public static void main(String[] args) {
		
		String name = "ABBACDDBCsSs";

		FirstNonRepeatingCharacter.FirstNonRepeatingCharacter(name);
	}

}

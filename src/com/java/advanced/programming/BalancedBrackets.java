/*
 * 1. convert the string to char array and take the character stack
 * 2. Iterate over the each brackets
 * 3. If the bracket is open ones then add the bracket to the stack else
 * 4. If the brackets are closing then perform the pop but before popping check the stack isn't empty if empty return false
 * 5. Compare the popped bracket is the matching open bracket else return false
 * 6. Once the iteration is complete just check the stack isn't empty or not it should be empty if not then return false 
 */

package com.java.advanced.programming;

import java.util.Stack;

public class BalancedBrackets {

	public static boolean isBalanced(String balancedString) {

		Stack<Character> st = new Stack<> ();

		char[] arr = balancedString.toCharArray();

		for (char c: arr) {

			if (c == '(' || c == '{' || c == '[') {
				st.push(c);
			}else {
				if (c ==')' || c == '}' || c == ']') {

					if (!(st.isEmpty())){
						char popped_bracket = st.pop();
						if (c ==')' && popped_bracket != '('  || 
						    c =='}' && popped_bracket != '{'  ||
							c ==']' && popped_bracket != '[') {
							return false;
						}
					}else {
						return false;
					}
				}
			}
		}
		
		if (st.isEmpty()) {
			return true;
		}else {
			return false;
		}

	}

	public static void main(String[] args) {

	        System.out.println(isBalanced("()"));        // true
//	        System.out.println(isBalanced("()[]{}"));    // true
//	        System.out.println(isBalanced("(]"));        // false
//	        System.out.println(isBalanced("([)]"));      // false
//	        System.out.println(isBalanced("{[()]}"));    // true
//	        System.out.println(isBalanced("((()))"));    // true
//	        System.out.println(isBalanced("()("));       // false

	}
}
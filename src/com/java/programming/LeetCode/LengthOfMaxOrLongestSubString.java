package com.java.programming.LeetCode;

import java.util.*;
// https://docs.google.com/document/d/1LS1ap3uXQo3nMdd8LjTaQ0cSGXS_NpSbr1xkmQOO3jw/edit?tab=t.0
// If element that we are checking is present then remove it from the list , update the start index
// and if not present then add it to the list , add to the list + update the end index + calculate max_length

public class LengthOfMaxOrLongestSubString {

    public static int findStringLength(String st) {
       int start =0;
       int end = 0;
       int max_length =0 ;

        List<Character> list = new ArrayList<>();
        String maxSubstring = "";

        while(end< st.length()){
            if(!list.contains(st.charAt(end))){

                list.add(st.charAt(end));
                end++;

                // update max if needed
                if (list.size() > max_length) {
                    max_length = list.size();
                    // build substring from current window
                    StringBuilder sb = new StringBuilder();
                    for (Character c : list){
                        sb.append(c);
                    }
                    maxSubstring = sb.toString();
                }

            }else{
                list.remove(Character.valueOf(st.charAt(start)));
                start++;
            }
        }
        System.out.println("Maximum substring is : " + maxSubstring);
        return max_length;
    }

    public static void main(String[] args) {
        String value = "abcabcbb"; // Test string
        System.out.println(LengthOfMaxOrLongestSubString.findStringLength(value)); // Output should be 6 for "abcdef"
    }
}

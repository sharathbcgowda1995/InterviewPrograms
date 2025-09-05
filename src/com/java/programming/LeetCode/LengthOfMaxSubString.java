package com.java.programming.LeetCode;

import java.util.HashSet;
import java.util.*;
// https://docs.google.com/document/d/1LS1ap3uXQo3nMdd8LjTaQ0cSGXS_NpSbr1xkmQOO3jw/edit?tab=t.0
// If element that we are checking is present then remove it from the list , update the start index
// and if not present then add it to the list , add to the list + update the end index + calculate max_length

public class LengthOfMaxSubString {

    public static int findStringLength(String st) {
       int start =0;
       int end = 0;
       int max_length =0 ;

        List<Character> list = new ArrayList<>();

        while(end< st.length()){
            if(!list.contains(st.charAt(end))){
                list.add(st.charAt(end));
                end++;
                max_length = Math.max(max_length,list.size());
            }else{
                list.remove(Character.valueOf(st.charAt(start)));
                start++;
            }
        }
        return max_length;
    }

    public static void main(String[] args) {
        String value = "abcdefgghhg"; // Test string
        System.out.println(LengthOfMaxSubString.findStringLength(value)); // Output should be 6 for "abcdef"
    }
}

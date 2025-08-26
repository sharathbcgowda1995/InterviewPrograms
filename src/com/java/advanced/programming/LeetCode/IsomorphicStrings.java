package com.java.advanced.programming.LeetCode;

import java.util.HashMap;

public class IsomorphicStrings {
    //    Input: s = "egg", t = "add"
//    Output: true
    public static void main(String[] args) {
        String s = "egga";
        String t = "adda";
        System.out.println(isIsomorphic(s,t));
    }

    static boolean isIsomorphic(String s, String t) {
        boolean flag = true ;
        if (s.length() != t.length()) {
            flag = false;
            return flag;
        } else {
            HashMap<Character, Character> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    if (map.get(s.charAt(i)) != t.charAt(i)) {
                        flag = false;
                    }
                } else {
                    map.put(s.charAt(i), t.charAt(i));
                }
            }
        }
        return flag;
    }
}

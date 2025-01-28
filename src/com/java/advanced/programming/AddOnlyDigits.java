package com.java.advanced.programming;

public class AddOnlyDigits {

    public static void main(String[] args) {
        String word = "sh12st45e";
        System.out.print(sumDigits(word));
    }

    private static int sumDigits(String word) {
        char[] arr  = word.toCharArray();
        int sum = 0;
        for(char c : arr){
            if(Character.isDigit(c)){
                sum = sum + Character.getNumericValue(c);
            }
        }
        return sum;
    }
}

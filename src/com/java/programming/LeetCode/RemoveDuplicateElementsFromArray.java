package com.java.programming.LeetCode;

public class RemoveDuplicateElementsFromArray {

//    Input: nums = [0,0,1,1,1,2,2,3,3,4]
//    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicateElements(arr));
    }

    static int removeDuplicateElements(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;
            } else {
                arr[counter] = arr[i];
                counter++;
            }
        }
        return counter+1; // Here I have added one because we don't check last element with "i < arr.length - 1"
    }

}

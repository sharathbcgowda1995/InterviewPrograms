package com.java.programming.LeetCode.progress;

import java.util.PriorityQueue;

public class KthLargestElementInUnSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k = 3;
        System.out.println(findKthLargest(arr,k));
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int element : nums){
            queue.offer(element);
            if(queue.size()>k){
                queue.poll();
            }
        }
        return queue.peek();
    }
}

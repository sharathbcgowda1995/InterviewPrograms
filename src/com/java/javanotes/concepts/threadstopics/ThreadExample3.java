package com.java.javanotes.concepts.threadstopics;
/*
3. Using Anonymous Runnable
Quick and concise, no need to create a separate class.
 */
public class ThreadExample3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(
        new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running using Anonymous Runnable: " + Thread.currentThread().getName());
            }
        });
        t1.start();
    }
}


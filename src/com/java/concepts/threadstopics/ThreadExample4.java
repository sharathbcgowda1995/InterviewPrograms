package com.java.concepts.threadstopics;
/*
4. Using Lambda Expression (Java 8+)
Best shorthand for Runnable.
 */
public class ThreadExample4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread running using Lambda: " + Thread.currentThread().getName());
        });
        t1.start();
    }
}


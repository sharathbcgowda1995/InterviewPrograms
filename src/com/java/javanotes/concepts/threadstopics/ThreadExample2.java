package com.java.javanotes.concepts.threadstopics;

public class ThreadExample2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}

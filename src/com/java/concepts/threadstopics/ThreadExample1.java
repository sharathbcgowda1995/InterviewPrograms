package com.java.concepts.threadstopics;

public class ThreadExample1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // starts new thread

        MyThread t2 = new MyThread();
        t2.start();
    }
}

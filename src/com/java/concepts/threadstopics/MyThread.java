package com.java.concepts.threadstopics;
//1. Extending Thread class
//Override run() method.
//Call start() to begin execution.
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread running using Thread class: " + Thread.currentThread().getName());
    }
}

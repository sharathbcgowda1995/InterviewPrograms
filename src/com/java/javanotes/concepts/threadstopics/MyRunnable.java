package com.java.javanotes.concepts.threadstopics;
/*
2. Implementing Runnable interface
More flexible than extending Thread because you can still extend another class.
 */
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread running using Runnable: " + Thread.currentThread().getName());
    }
}


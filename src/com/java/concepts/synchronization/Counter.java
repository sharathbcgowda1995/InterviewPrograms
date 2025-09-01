package com.java.concepts.synchronization;

public class Counter {

    int count = 0;

    //1. Making the method synchronized
    public synchronized int incrementCount() {
        return count += 1;
    }

//    //2. Making the block synchronized
//    public int incrementCount() {
//
//        synchronized (this) {
//            return count += 1;
//        }

    //3. Making the method static synchronized
    // static int count = 0;
//    public static synchronized int incrementCount() {
//            return count += 1;
//        }


    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) c.incrementCount();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) c.incrementCount();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }

}

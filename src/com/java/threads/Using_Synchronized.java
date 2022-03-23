package com.java.threads;

public class Using_Synchronized {

	int count;

	public synchronized void increment() {
		count++;
	}

	public static void main(String[] args) throws Exception {

		Using_Synchronized sync = new Using_Synchronized();

		Runnable r = () -> {
			for (int i = 1; i <= 3000; i++) {
				sync.increment();
			}
		};

		Thread t1 = new Thread(r);
		t1.start();

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 3000; i++) {
				sync.increment();
			}
		});

		t2.start();

		t1.join();
		t2.join();

		System.out.println(t1.isAlive());

		System.out.println("Total count is : " + sync.count);

	}

}

package com.java.threads;

public class UsingThreadClass extends Thread {

	int[] values = { 1, 2, 3, 4, 5 };

	public void run() {

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i] * 2);
		}

	}

	public static void main(String[] args) {

		Thread t1 = new UsingThreadClass();
		// UsingThreadClass t1 = new UsingThreadClass();
		// t1.run();//it won't act as a thread untill we call the start() method
		t1.start();
	}

}

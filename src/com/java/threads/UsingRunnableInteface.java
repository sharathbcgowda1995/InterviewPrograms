package com.java.threads;

class D implements Runnable {

	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("D class");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

class E implements Runnable {

	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("E class");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class UsingRunnableInteface {

	public static void main(String[] args) {

//		Runnable t1 = new D();
//		Runnable t2 = new E();

		D t1 = new D();
		E t2 = new E();

// Here we have to create the thread object to pass the runnable object in a start() meth
// Because the runnable interface don't have the start method but we can pass them in the thread start meth as a param

		Thread s1 = new Thread(t1);
		Thread s2 = new Thread(t2);

		s1.start();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		s2.start();

	}

}

package com.java.javanotes.threads;

public class UsingWaitAndNotify {

	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}
}

class Q {
	int num;
	boolean valueSet = false;
	public synchronized void set(int num) {
		while (valueSet) {
			try {
				wait();
			} catch (Exception e) {

			}
		}
		System.out.println("Set : " + num);
		this.num = num;
		valueSet = true;
		notify();
	}

	public synchronized void get() {
		while (!valueSet) {
			try {
				wait();
			} catch (Exception e) {

			}
		}
		System.out.println("Get : " + num);
		valueSet = false;
		notify();
	}
}

class Producer implements Runnable {
	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Producer thread");
		t.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {// we use while loop for infinite iteration
			q.set(i++);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

}

class Consumer implements Runnable {
	Q q;

	public Consumer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Consumer head");
		t.start();
	}

	@Override
	public void run() {

		while (true) {
			q.get();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

	}

}

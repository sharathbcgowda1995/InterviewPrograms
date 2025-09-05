package com.java.javanotes.threads;

class B extends Thread {

	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("B class");
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		}

	}

}

class C extends Thread {

	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("C class");
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		}

	}

}

public class UsingClassThread {

	public static void main(String[] args) {

//		Thread t1 = new B();//we can also write like this 
//		Thread t2 = new C();

		B t1 = new B();
		C t2 = new C();

		t1.start();
		
//		to avoid the thread overlap we can use thread.sleep
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		
		t2.start();

	}

}

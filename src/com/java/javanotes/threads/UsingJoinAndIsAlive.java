package com.java.javanotes.threads;

public class UsingJoinAndIsAlive {

	public static void main(String[] args) throws Exception {

		Thread s1 = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("F class");
				try {Thread.sleep(500);} catch (InterruptedException e) {}
			}
		});
		
		Thread s2 = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("G class");
				try {Thread.sleep(500);} catch (InterruptedException e) {}
			}
		});

		System.out.println("is the thread s1 alive ? : " + s1.isAlive());		
		
		s1.start();
		Thread.sleep(2000);
		s2.start();
		
		System.out.println("is the thread s1 alive ? : " + s1.isAlive());
		
		s1.join();
		s2.join();
		
		System.out.println("is the thread s1 alive ? : " + s1.isAlive());
		
		System.out.println("Main thread is executed now");

	}

}

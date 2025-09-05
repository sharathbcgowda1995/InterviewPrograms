package com.java.javanotes.threads;

public class SetGetPriorityOfThread {

	public static void main(String[] args) throws Exception {
		Thread s1 = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Sharath Thread : " + Thread.currentThread().getPriority());
				try {Thread.sleep(500);} catch (InterruptedException e) {}
			}
		});
		
		Thread s2 = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Nagashree thread : " + Thread.currentThread().getPriority());
				try {Thread.sleep(500);} catch (InterruptedException e) {}
			}
		});	
		
		System.out.println("Setting and getting name of thread");
		
		System.out.println("Default thread name : " + s1.getName());
		s1.setName("Sharath Thread");
		System.out.println("After thread name : " +s1.getName());
		System.out.println(s2.getName());
		s2.setName("Nagashree Thread");
		System.out.println(s2.getName());
		
		//maximum is 10 and min is 1
		System.out.println("Setting and getting priority of thread");
		
		System.out.println("Default thread priority : " +s1.getPriority());
		s1.setPriority(6);
		System.out.println("After thread Priority : " +s1.getPriority());
		s1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(s1.getPriority());
		s1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(s1.getPriority());

		s1.start();
		s2.start();

	}

}

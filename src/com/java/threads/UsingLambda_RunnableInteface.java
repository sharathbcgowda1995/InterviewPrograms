package com.java.threads;

//Step : 1
//class F implements Runnable {
//
//	public void run() {
//
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("F class");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//
//	}
//
//}
//
//class G implements Runnable {
//
//	public void run() {
//
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("G class");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//
//	}
//
//}
//
//public class UsingLambda_RunnableInteface {
//
//	public static void main(String[] args) {
//
////		Runnable t1 = new D();
////		Runnable t2 = new E();
//
//		F t1 = new F();
//		G t2 = new G();
//
//// Here we have to create the thread object to pass the runnable object in a start() meth
//// Because the runnable interface don't have the start method but we can pass them in the thread start meth as a param
//
//		Thread s1 = new Thread(t1);
//		Thread s2 = new Thread(t2);
//
//		s1.start();
//
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		s2.start();
//
//	}
//
//}

//Step : 2 removing the class only implementing the runnable interface
//public class UsingLambda_RunnableInteface {
//
//	public static void main(String[] args) {
//
//		Runnable t1 = new Runnable() {
//			public void run() {
//
//				for (int i = 1; i <= 10; i++) {
//					System.out.println("F class");
//				}
//
//			}
//		};
//		Runnable t2 = new Runnable() {
//			public void run() {
//
//				for (int i = 1; i <= 10; i++) {
//					System.out.println("G class");
//				}
//
//			}
//		};
//
//// Here we have to create the thread object to pass the runnable object in a start() meth
//// Because the runnable interface don't have the start method but we can pass them in the thread start meth as a param
//
//		Thread s1 = new Thread(t1);
//		Thread s2 = new Thread(t2);
//
//		s1.start();
//		s2.start();
//
//	}
//
//}

//Step : 3
//write the run method with lambda exp and remove meth  name interface name
//directly assign the run meth lambda implementation to the Runnable reference
//public class UsingLambda_RunnableInteface {
//
//	public static void main(String[] args) {
//
//		Runnable t1 = () -> {
//			for (int i = 1; i <= 10; i++) {
//				System.out.println("F class");
//			}};
//			
//		Runnable t2 = ()-> {
//				for (int i = 1; i <= 10; i++) {
//					System.out.println("G class");
//				}};
//
//// Here we have to create the thread object to pass the runnable object in a start() meth
//// Because the runnable interface don't have the start method but we can pass them in the thread start meth as a param
//
//		Thread s1 = new Thread(t1);
//		Thread s2 = new Thread(t2);
//
//		s1.start();
//		s2.start();
//
//	}
//
//}

//Step: 4 Directly pass the run method lambda expression in the Thread constructor while thread class creation
public class UsingLambda_RunnableInteface {

	public static void main(String[] args) {

		Thread s1 = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("F class");
			}
		});
		Thread s2 = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("G class");
			}
		});

		s1.start();
		s2.start();

	}

}

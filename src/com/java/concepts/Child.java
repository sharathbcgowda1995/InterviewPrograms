package com.java.concepts;

class Parent {

	public void overr() {
		System.out.println("======");
	}

}

public class Child extends Parent {

	void walk() {
		System.out.println("+++");
	}

	public static void main(String[] args) {
		Parent p = new Child();
		// p.walk(); Compile time error
	}
}
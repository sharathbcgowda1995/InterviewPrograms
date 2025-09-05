package com.java.advanced.programming.automationengineer.standard;

public class StackUsingArray {

	private int top = -1;
	private int n = 5; // Initial size of the stack
	private int[] arr = new int[n];

	// Push element onto the stack
	public void push(int element) {
		if (top == (n - 1)) {
			System.out.println("Stack/Array is full");
		} else {
			top++;
			arr[top] = element;
			System.out.println("Pushed element: " + element);
		}
	}

	// Pop element from the stack
	public void pop() {
		if (top == -1) {
			System.out.println("Stack/Array is empty");
		} else {
			System.out.println("Popped element: " + arr[top]);
			top--;
		}
	}

	// Peek at the top element of the stack
	public int peek() {
		if (top == -1) {
			throw new IllegalStateException("Stack/Array is empty");
		} else {
			return arr[top];
		}
	}

	// Check if the stack is empty
	public boolean isEmpty() {
		return top == -1;
	}

	public static void main(String[] args) {
		StackUsingArray obj = new StackUsingArray();

		// Pushing elements onto the stack
		obj.push(10);
		obj.push(20);
		obj.push(30);

		// Peeking the top element
		System.out.println("Top element: " + obj.peek());

		// Popping elements
		obj.pop();
		obj.pop();

		// Checking top element after pops
		try {
			System.out.println("Top element after pops: " + obj.peek());
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage()); // Stack is empty, handling exception
		}

		// Checking if the stack is empty
		System.out.println("Is stack empty? " + obj.isEmpty());
	}
}

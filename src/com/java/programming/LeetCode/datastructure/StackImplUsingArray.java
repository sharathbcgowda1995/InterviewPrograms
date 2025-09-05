package com.java.programming.LeetCode.datastructure;

public class StackImplUsingArray {

	int top = -1;
	int size;
	int arr[];

	public StackImplUsingArray(int size) {
		this.size = size;
		arr = new int[size];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == size - 1);
	}

	public void push(int element) {
		if (isFull() == false) {
			top++;
			arr[top] = element;
			System.out.println("Added element to the stack is : " + arr[top]);
		} else {
			System.out.println("Stack is full  ");
		}
	}

	public void pop() {

		if (isEmpty() == false) {
			int returnedTop = top;
			top--;
			System.out.println("Popped element is : " + arr[returnedTop]);
		} else {
			System.out.println("the stack is empty");
		}

	}

	public int peek() {
		if (isEmpty() == false) {
			return arr[top];
		} else {
			System.out.println("Stack is empty ");
			return -1;
		}
	}

	public static void main(String[] args) {

		StackImplUsingArray stack = new StackImplUsingArray(10);
		System.out.println("----------PUSH--------------");

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		System.out.println("----------POP-------------");

		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();

		System.out.println("---------PUSHING AGAIN------------");

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		System.out.println("------------Pushing after the array is full -----------");

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		// Here we play with index so values will not get deleted
//		for (int i=0;i<stack.arr.length ;i++) {
//			System.out.print(" "+ stack.arr[i]);
//		}
	}

}

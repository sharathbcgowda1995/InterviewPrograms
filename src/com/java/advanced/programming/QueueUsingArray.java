package com.java.advanced.programming;

public class QueueUsingArray {
    
    private int lengthOfArray = 5;
    private int top = -1;  // This represents the 'rear' in your case
    int[] arr = new int[lengthOfArray];
    
    // Add an element to the queue (similar to 'enqueue')
    public void offer(int element) {
        if (top == lengthOfArray - 1) {
            System.out.println("Queue/Array is full");
        } else {
            top++;  // Increment 'top' as we add to the queue
            arr[top] = element;
        }
    }
    
    // Remove and return the front element of the queue (similar to 'dequeue')
    public int poll() {
        if (top == -1) {
            System.out.println("Queue/Array is empty");
            return -1;  // Return a special value to indicate the queue is empty
        } else {
            int frontElement = arr[0];
            
            // Shift elements to the left to maintain the queue order
            for (int i = 0; i < top; i++) {
                arr[i] = arr[i + 1];
            }
            top--;  // Decrease 'top' after removing the front element
            return frontElement;
        }
    }
    
    // Peek at the front element without removing it
    public int peek() {
        if (top == -1) {
            System.out.println("Queue/Array is empty");
            return -1;  // Return a special value to indicate the queue is empty
        } else {
            return arr[0];
        }
    }

    // Main method for testing the queue operations
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();

        // Testing the Queue operations
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println("Front element: " + queue.peek());

        // Polling elements
        System.out.println("Polled: " + queue.poll());  // Removes 10
        System.out.println("Polled: " + queue.poll());  // Removes 20

        System.out.println("Front element after polling: " + queue.peek());

        // Polling remaining elements
        System.out.println("Polled: " + queue.poll());  // Removes 30
        System.out.println("Polled: " + queue.poll());  // Removes 40
        System.out.println("Polled: " + queue.poll());  // Removes 50

        // Attempting to peek or poll from an empty queue
        System.out.println("Trying to peek from empty queue: " + queue.peek());
        System.out.println("Trying to poll from empty queue: " + queue.poll());
    }
}

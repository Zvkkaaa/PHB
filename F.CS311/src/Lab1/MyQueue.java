package Lab1;

import java.util.Scanner;

public class MyQueue {
	int front, rear;
	int size;
	int capacity;
	int array[];

	public MyQueue(int capacity) {
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = new int[this.capacity];
	}

// size capacity tentseh uyd queue duurne
	boolean isFull(MyQueue queue) {
		return (queue.size == queue.capacity);
	}

// size 0 uyd queue hooson bna
	boolean isEmpty(MyQueue queue) {
		return (queue.size == 0);
	}

// daraalald utga oruulah
	void enqueue(int item) {
		if (isFull(this))
			return;
		this.rear = (this.rear + 1) % this.capacity;
		this.array[this.rear] = item;
		this.size = this.size + 1;
		System.out.println(item + " enqueued to queue");
	}

// daraallaas utga gargah
	int dequeue() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		int item = this.array[this.front];
		this.front = (this.front + 1) % this.capacity;
		this.size = this.size - 1;
		return item;
	}

// daraalliin hamgiin urd taliin utgiig awah
	int front() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		return this.array[this.front];
	}

// daraalliin hamgiin ard taliin utgiig awah
	int rear() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		return this.array[this.rear];
	}

}
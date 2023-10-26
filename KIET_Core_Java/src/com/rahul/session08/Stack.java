package com.rahul.session08;

import java.util.Arrays;

public class Stack {
	private int top;
	private int arr[];

	public Stack() {
		top = -1;
		arr = new int[4];
	}

	public Stack(int size) {
		top = -1;
		arr = new int[size];
	}

	public boolean isFull() {
		return top == this.arr.length - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean push(int item) {
		if (isFull())
			return false;
		arr[++top] = item;
		return true;
	}
	public int pop() {
		if(isEmpty())
			return -9999;
		int item = arr[top];
		top--;
		return item;
	}
	@Override
	public String toString() {
		return "Stack [top=" + top + ", arr=" + Arrays.toString(arr) + "]";
	}

}

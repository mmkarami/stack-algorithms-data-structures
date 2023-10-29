package com.mmkarami.stack.impl;

import com.mmkarami.stack.adt.Stack;

public class StackArray<E> implements Stack<E> {

	private Object[] elements;

	private int topOfStack;

	public StackArray(int size) {
		this.elements = new Object[size];
		this.topOfStack = -1;
	}

	@Override
	public int topOfStack() {
		return topOfStack;
	}

	@Override
	public boolean isEmpty() {
		return topOfStack() == -1;
	}

	@Override
	public boolean isFull() {
		return topOfStack() == this.elements.length - 1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E peek() {
		return isEmpty() ? null : (E) this.elements[topOfStack()];
	}

	@Override
	public void push(E element) {
		if (isFull())
			new RuntimeException();
		this.elements[++this.topOfStack] = element;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E pop() {
		if (isEmpty())
			new RuntimeException();
		return (E) this.elements[topOfStack--];
	}

}
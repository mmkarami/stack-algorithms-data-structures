package com.mmkarami.stack.impl;

import java.util.ArrayList;

import com.mmkarami.stack.adt.Stack;

public class StackArrayList<E> implements Stack<E> {

	private ArrayList<E> elements;

	private int topOfStack;

	public StackArrayList() {
		this.elements = new ArrayList<>();
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
		return false;
	}

	@Override
	public E peek() {
		return isEmpty() ? null : this.elements.get(topOfStack());
	}

	@Override
	public void push(E element) {
		if (isFull())
			new RuntimeException();
		if (topOfStack() + 2 > this.elements.size())
			this.elements.add(element);
		else
			this.elements.set(topOfStack(), element);
		this.topOfStack++;
	}

	@Override
	public E pop() {
		if (isEmpty())
			new RuntimeException();
		return this.elements.get(topOfStack--);
	}
}
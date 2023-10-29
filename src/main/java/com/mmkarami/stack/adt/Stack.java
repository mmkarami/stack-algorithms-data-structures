package com.mmkarami.stack.adt;

public interface Stack<E> {
	
	int topOfStack();
	
	boolean isEmpty();

	boolean isFull();
	
	E peek();
	
	void push(E element);
	
	E pop();

}
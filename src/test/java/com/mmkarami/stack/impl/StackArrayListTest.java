package com.mmkarami.stack.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.mmkarami.stack.adt.Stack;

public class StackArrayListTest {

	@Test
	public void testCreate_whenCreateStack_thenItMustBeEmpty() {

		// Arrange
		Stack<Integer> stack;

		// Act
		stack = new StackArrayList<Integer>();

		// Assert
		assertEquals(-1, stack.topOfStack());
	}

	@Test
	public void testIsEmpty_whenCreateStack_thenItMustBeEmpty() {

		// Arrange
		var stack = new StackArrayList<Integer>();

		// Act
		boolean result = stack.isEmpty();

		// Assert
		assertEquals(true, result);
	}

	@Test
	public void testPop_whenPop_thenItMustBePoped() {

		// Arrange
		var stack = new StackArrayList<Integer>();
		stack.push(35);
		stack.push(30);

		// Act
		Integer result = stack.pop();

		// Assert
		assertEquals(30, result);
		assertEquals(0, stack.topOfStack());
	}

	@Test
	public void testPush_whenPush_thenItMustBePushed() {

		// Arrange
		var stack = new StackArrayList<Integer>();

		// Act
		stack.push(31);

		// Assert
		assertEquals(31, stack.peek());
		assertEquals(0, stack.topOfStack());
	}
}
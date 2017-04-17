package com.tcp.study;

import java.util.List;

public class Stack<T extends Object> {

	private Object[] list = new Object[Integer.MAX_VALUE];
	private int top = 0;

	public boolean isEmpty() {
		if (list.length == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void push(T data) {
		try {
			list[top++] = data;
		} catch (StackOverflowError e) {
			e.printStackTrace();
		}
	}

	public T pop() {
		try {
			if (isEmpty())
				throw new StackUnderflowError();
			else
				return (T) list[top--];
		} catch (StackUnderflowError e) {
			e.getMessage();
			return null;
		}
	}
}

package com.iit.stack;

public interface Stack {
	public int size();
	public boolean isEmpty();
	public boolean isFull();
	public Object top() throws StackEmptyException;
	//update methods
	public void push(Object element) throws StackFullException;
	public Object pop() throws StackEmptyException;

}

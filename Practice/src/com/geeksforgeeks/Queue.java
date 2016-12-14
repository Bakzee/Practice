package com.geeksforgeeks;
/*
 * Implementastion of Circular Queue using arrays and generics
 */
import java.lang.reflect.Array;

public class Queue<T> {
	private static final int SPECIAL_EMPTY_VALUE=-1;
	private static int MAX_SIZE=40;
	private T[] elements;
	
	private int head=SPECIAL_EMPTY_VALUE;
	private int tail= SPECIAL_EMPTY_VALUE;
	
	public Queue(Class<T> clazz){
		elements= (T[]) Array.newInstance(clazz, MAX_SIZE);
	}
	
	public static class QueueOverflowException extends Exception{
		
	}
	
	public static class QueueUnderflowException extends Exception{
		
	}
	
	public boolean isEmpty(){
		return head==SPECIAL_EMPTY_VALUE;
	}
	
	public boolean isFull(){
		int next=(tail+1)%elements.length;
		return next==head;
	}
	
	public void enQueue(T data) throws QueueOverflowException{
		if(isFull()){
			throw new QueueOverflowException();
		}
		tail=(tail+1)%elements.length;
		elements[tail]=data;
		
		if(head==SPECIAL_EMPTY_VALUE)
			head=tail;
	}
	
	public T deQueue() throws QueueUnderflowException{
		if(isEmpty()){
			throw new QueueUnderflowException();
		}
		T data = elements[head];
		if(head==tail)
			head=SPECIAL_EMPTY_VALUE;
		else
			head=(head+1)%elements.length;
	return data;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new Queue<Integer>(Integer.class);
		try{
		q.enQueue(15);
		q.enQueue(20);
		q.enQueue(25);
		}
			catch (QueueOverflowException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		try {
		System.out.println("the elements are "+q.deQueue());
		System.out.println("the elements are "+q.deQueue());
		System.out.println("the elements are "+q.deQueue());
		}catch (QueueUnderflowException e){
			e.printStackTrace();
		}
	}

}

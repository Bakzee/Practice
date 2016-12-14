package com.geeksforgeeks;
/*
 * Create a Queue using two stacks 
 * performace is not as good as the normal Queue
 * 
 * We use two staclks  forward and reverse
 * enque(item)
 * 	if(forward.isempty)
 *   while(!reverse.isempty)
 *     forward.push(reverse.pop())
 *  forward.push(item)
 *
 * dequeue()
 *  if(reverse.isempty)
 *    while(!forward.empty)
 *      reverse.push(forward.pop())
 *   return reverse.pop()
 * 
 */

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueueUsing2Stks<T> {
	private Stack<T> forwardStack = new Stack<>();
	private Stack<T> reverseStack = new Stack<>();
	private static Scanner input;
	
	public QueueUsing2Stks(){
		
	}

	public boolean isEmpty(){
		return forwardStack.isEmpty() || reverseStack.isEmpty();
	}
	
	public void enQueue(T item) {
			if(forwardStack.isEmpty()){
				while(!reverseStack.isEmpty()){
					forwardStack.push(reverseStack.pop());
				}
			}
			forwardStack.push(item);
	}
	
	public  T deQueue(){
		if(reverseStack.isEmpty()){
			while(!forwardStack.isEmpty()){
				reverseStack.push(forwardStack.pop());
			}
		}
		return reverseStack.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsing2Stks<Integer> queue = new QueueUsing2Stks<>();
		input = new Scanner(System.in);
		System.out.println("Enter the size of Queue");
		int n = input.nextInt();
		for(int i=0;i<n;i++)
			queue.enQueue(input.nextInt());
		for(int i=0;i<n;i++)
			System.out.print(queue.deQueue()+" ");
}
}

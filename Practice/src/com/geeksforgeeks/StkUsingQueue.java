package com.geeksforgeeks;
/*
 * Stack using Single Queue 
 */
import java.util.ArrayDeque;
import java.util.Queue;

public class StkUsingQueue<T> {
	private Queue<Integer> queue = new ArrayDeque<Integer>();	
	public void push(int data){
		int size = queue.size();
		queue.add(data);
		for(int i=0;i<size;i++){
			int val=queue.remove();
			queue.add(val);
		}
			
	}
	
	public int pop(){
		if(queue.isEmpty())
			System.out.println("Empty");;
		return queue.remove();
	}
	public static void main(String[] arsg){
		StkUsingQueue<Integer> stack = new StkUsingQueue<Integer>();
		for(int i=0;i<10;i++)
			stack.push(i);
		for(int i=0;i<10;i++)
			System.out.println(stack.pop());
	}

}

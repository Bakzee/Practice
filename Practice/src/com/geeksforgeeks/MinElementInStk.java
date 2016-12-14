package com.geeksforgeeks;
/*
 * Program to find the minimun element of stack
 * use two stack one for elements and other for minElement
 * o(1) to get the minumum element
 */

import java.util.Scanner;
import java.util.Stack;

public class MinElementInStk {
	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> minStack = new Stack<Integer>();
	private static Scanner input;
	
	public boolean isEmpty(){
		return stack.isEmpty()||minStack.isEmpty();
	}
	
	public void push(Integer item){
		int min =item;
		if(!minStack.isEmpty())
			if(min>minStack.peek())
				min=minStack.peek();
		stack.push(item);
		minStack.push(min);
	}
	
	public int pop(){
		if(stack.isEmpty())
			return 0;
		minStack.pop();
		return stack.pop();
	}
	
	public int getMinimum(){
		if(minStack.isEmpty())
			return 0;
		return minStack.peek();
	}
	
	public static void main(String[] args){
		MinElementInStk a = new MinElementInStk();
		input = new Scanner(System.in);
		System.out.println("Enter size ");
		int n = input.nextInt();
		for(int i=0;i<n;i++)
			a.push(input.nextInt());
		System.out.println("the min element is "+a.getMinimum());
		a.pop();
		System.out.println("the min element is "+a.getMinimum());
		a.pop();
		System.out.println("the min element is "+a.getMinimum());
		a.pop();
		System.out.println("the min element is "+a.getMinimum());
		
		
	}
}

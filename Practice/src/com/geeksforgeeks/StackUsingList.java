package com.geeksforgeeks;
/*
 * Implementation of Stack of Generic Type using Queue 
 */

import java.util.Scanner;

public class StackUsingList{
	public static class Element<T>{
		private T data;
		private Element next;
		
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public Element getNext() {
			return next;
		}
		public void setNext(Element next) {
			this.next = next;
		}
		
		public Element(T data,Element next){
			this.data=data;
			this.next=next;
		}
	}
		
		
		public static class Stack<T>{
			
		private static int MAX_SIZE=40;
		private Element<T> top;
		private static int size=0;
		
		public void push(T data){
			if(size==MAX_SIZE)
				System.out.println("Stack is full");
			Element elem = new Element(data, top);
			top=elem;
			size++;
		}
		public T pop(){
			if(size==0)
				System.out.println("Stack is empty");
			T data = top.getData();
			top=top.next;
			size--;
			return data;
		}
		public T peek(){
			if(size==0)
				System.out.println("No elements");
			return top.getData();
		}
		}
		
	
	public static void main(String[] args){
		Stack<Integer> stack = new Stack<Integer>();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=0;i<n;i++)
			stack.push(input.nextInt());
		for(int i=0;i<n;i++){
			System.out.println("Size: "+stack.size);
			System.out.println(stack.pop());
		}
	}
	}

package com.iit.stack;

public class ArrayStack implements Stack {
	private int t=-1,n;
	private Object s[];
	private static final int CAPACITY=1024;
	//default size
	public ArrayStack(){
		this.n=CAPACITY;
	}
	//user size
	public ArrayStack(int cap){
		this.n=cap;
		this.s= new Object[n]; 
	}
	@Override
	public int size() {
		return t+1;		
	}

	@Override
	public boolean isEmpty() {
		return t<0;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return t==n;
	}

	@Override
	public Object top() throws StackEmptyException {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new StackEmptyException("Stack is empty");
		return s[t];
	}

	@Override
	public void push(Object element) throws StackFullException {
		// TODO Auto-generated method stub
		if(isFull())
			throw new StackFullException("Stack is Full");
		s[++t]=element;
	}

	@Override
	public Object pop() throws StackEmptyException {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new StackEmptyException("Stack is empty");
		Object obj=s[t];
		--t;
		return obj;
	}
	
	public void printStack(){
		for(int i=0;i<n;i++)
			System.out.println(s[i]);
	}
	
	
	public static void main(String[] args){
		ArrayStack stk = new ArrayStack(10);
		for(int i=0;i<10;i++)
			stk.push(i);
		stk.printStack();
		//stk.push(15);
		System.out.println("the poped element is "+stk.pop());
		System.out.println("the poped element is "+stk.pop());
		System.out.println("the poped element is "+stk.pop());
		System.out.println("the size is "+stk.size());
		System.out.println("the poped element is "+stk.pop());
	}

}

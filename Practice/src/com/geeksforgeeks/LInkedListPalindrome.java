package com.geeksforgeeks;
/*
 * Naive way of reversing the palindrome O(2n)
 */
import java.util.Scanner;
import java.util.Stack;

public class LInkedListPalindrome {
	// Structure of class Node is
	Node head;
		class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
		/* Push a node to linked list. Note that this function
	       changes the head */
	    public void push(int new_data) 
	    {
	        /* Allocate the Node &
	           Put in the data */
	        Node new_node = new Node(new_data);
	 
	        /* link the old list off the new one */
	        new_node.next = head;
	 
	        /* Move the head to point to new Node */
	        head = new_node;
	    }
	 
	    // A utility function to print a given linked list
	    void printList(Node ptr) 
	    {
	        while (ptr != null) 
	        {
	            System.out.print(ptr.data + "->");
	            ptr = ptr.next;
	        }
	        System.out.println("NULL");
	    }

	
	    boolean isPalindrome(Node head) 
	    {
	     Stack<Integer> stack = new Stack<Integer>();
	     Node curr=head;
	     while(head!=null){
	         stack.push(head.data);
	         head=head.next;
	     }
	     while(curr!=null){
	     if(curr.data==stack.pop()){
	    	// System.out.println(curr.data);
	        curr=curr.next;
	     }
	     else
	        return false;
	     }
	     return true;
	    } 
	    
	        
	    public static void main(String args[]){
	    	LInkedListPalindrome list = new LInkedListPalindrome();
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        while(n>0){
	       // System.out.println("Enter length og loist");
	        int size = scan.nextInt();
	            for(int i=0;i<size;i++){
	                list.push(scan.nextInt());
	            }
	         boolean ans = list.isPalindrome(list.head);
	         System.out.println(ans);
	         n--;
	        }
	    }
	    
}
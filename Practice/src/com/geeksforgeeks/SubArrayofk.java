package com.geeksforgeeks;
/*Maximum of all subarrays of size k (Added a O(n) method)
Given an array and an integer k, find the maximum for each and every contiguous subarray of size k.
normally O(n^2)
using queue O(n)
Examples:

Input :
arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}
k = 3
Output :
3 3 4 5 5 5 6

Input :
arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}
k = 4
Output :
10 10 10 15 15 90 90
*/
import java.util.Deque;
import java.util.LinkedList;

public class SubArrayofk {
	public static void maxofSubk(int[] a, int k){
		Deque<Integer> q =new LinkedList<Integer>();
		int n=a.length;
		int i;
		for(i=0;i<k;i++){
			if((!q.isEmpty())&& (a[i]>=a[q.getLast()]))
				q.removeLast();
			q.addLast(i);
		}	
		for(;i<n;i++){
			System.out.println(a[q.getFirst()]);
			while((!q.isEmpty())&&(q.getFirst()<=i-k))
				q.removeFirst();
			while((!q.isEmpty())&& (a[i]>=a[q.getLast()]))
				q.removeLast();
			q.addLast(i);
		}
		System.out.println(a[q.getFirst()]);
	}
	public static void main(String[] args){
		int[] arr={12, 1, 78, 90, 57, 89, 56};
		int k=3;
		maxofSubk(arr, k);
	}
}
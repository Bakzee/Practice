package com.thinkjava;

import java.util.Random;

public class Echo {

	public static void randamize(int[] arr,int n){
		for (int i=0;i<n;i++){
			//create a random value for jth position
			Random value = new Random();
			int j = value.nextInt(n);
			int temp=arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
	}
	
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8,9};
		randamize(arr,arr.length);
		for(int i:arr)
		System.out.print(i);
}
}

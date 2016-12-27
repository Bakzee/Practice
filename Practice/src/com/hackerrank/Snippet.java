package com.hackerrank;

import java.util.Scanner;

public class Snippet {
	//private static Scanner input;
	public static void isPrime(int n){
        for(int i=2;i<Math.sqrt(n);i++)
            if((n%i)==0) System.out.println("Not Prime");
        System.out.println("Prime");
	}
	public static void main(String[] args) {
	      	Scanner input = new Scanner(System.in);
	        int N = input.nextInt();
	        for(int j=0;j<N;j++){
	        	int z = input.nextInt();
	        	--N;
	        	isPrime(z);
	        }
	    }
}

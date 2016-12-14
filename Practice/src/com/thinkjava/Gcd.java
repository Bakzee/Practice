package com.thinkjava;

import java.util.Scanner;

public class Gcd {
	
	public static int GCD(int a,int b){
		while(b>0){
			int r =a%b;
			a=b;
			b=r;
		}
		return a;
	}
	public static void primeFac(int n){
		while(n%2==0){
			System.out.print("2"+" ");
			n/=2;
		}
		for(int i=3;i<Math.sqrt(n);i+=2){
			if(n%i==0)
				System.out.print(i+" ");
			n/=i;
		}
		if (n > 2)
            System.out.print(n);
		System.out.println();
		}
}

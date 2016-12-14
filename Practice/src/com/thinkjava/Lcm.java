package com.thinkjava;

import java.util.Scanner;
import com.thinkjava.Gcd ;

public class Lcm {

	public static int LCM(int a,int b,int gcd){
		return a*b/gcd;
	}
	public static void main(String[] args){
		Scanner val = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = val.nextInt();
		System.out.println("Enter b:");
		int b =val.nextInt();
		Gcd.primeFac(a);
		Gcd.primeFac(b);
		int gcd=Gcd.GCD(a, b);
		int lcm=LCM(a,b,gcd);
		System.out.println("The gcd is "+gcd);
		System.out.println("The lcm is "+lcm);
		
	}

}

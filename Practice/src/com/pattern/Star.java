package com.pattern;

class Star 
{
public static void main(String[] args) 
{
	for(int i=5;i>0;i--){
		for(int j=1;j<i;j++){
			System.out.print(" ");
			}
		for(int k=5;k>=i;k--){
			System.out.print("*");
		}
		System.out.println();
	}
	}
}
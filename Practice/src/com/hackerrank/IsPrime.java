package com.hackerrank;

public class IsPrime {
	public static boolean checkIsPrime(int n){
	for(int i=2;i<Math.sqrt(n);i++)
        if(n%i==0) return false;
    return true;
	}
	public static void main(String[] args){
		Boolean val1 = checkIsPrime(12);
		assert val1.toString().equals("false");
		Boolean val2 = checkIsPrime(13);
//		assert val2.toString().equals("false");
		assert val2.toString().equals("true");
	}

}

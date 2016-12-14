package com.geeksforgeeks;
/* IMPORTANT: Multiple classes and nested static classes are supported */


// uncomment this if you want to read input.
//imports for BufferedRe

//import for Scanner and other utility  classes
import java.util.*;


class TestClass {
	public void quickSort(int[] a,int low,int high){
		while(low>=high){
			return;
		}
		int pivotPoint = partition(a,low,high);
		quickSort(a,low,pivotPoint-1);
		quickSort(a,pivotPoint+1,high);
	}
    public static int partition(int[] a,int low,int high){
    	int pivot=a[low];
    	int l=low;
		int h=high;
    	while(l<h){
    		while(Math.abs(pivot)>Math.abs(a[l])){
    			l++;
    		}
    		while(Math.abs(pivot)<Math.abs(a[h])){
    			h--;
    	}
    	swap(a,l,h);
    	}
    	return h;
    	}
    	public static void swap(int[] a,int i,int j){
    		int	temp = a[i];
    		a[i] =a[j];
    		a[j]=temp;
    	}
    	
    public static void main(String args[] ) {
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
		int a[]=new int[N];
        for (int i = 0; i < N; i++) {
            a[i]=s.nextInt();
        }
        TestClass obj = new TestClass();
     /*   for(int i=0;i<N;i++)
        	System.out.print(a[i]+" ");*/
        obj.quickSort(a,0,N-1);
        for(int i=0;i<N;i++)
        	System.out.print(a[i]+" ");
        }
}

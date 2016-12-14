package com.geeksforgeeks;
/*
 * Find the maximum sum in Strictly Increasing array
 * eg. {2,1,3,4,5}
 * output strictly increasing array {1,3,4,5}=13
 * 
 * O(n^2)
 */


public class MaxSumINcArray {
	public static int maxSum(int[] array){
		int sum=0;
		for(int i=0;i<array.length-1;i++){
			int max=array[i];
			int j=i+1;
			while(j<array.length&&array[i]<array[j]){//if first is not computed array out of bound occours
					max=max+array[j];//array[i]<array[j]&&j<array.length gives exception
					i++;
					j++;
				}
	
				if(max>sum)
					sum=max;
		}
		return sum;
	}
	/*
	 Let input array be 'arr[]' and size of array be 'n'

Initialize : 
max_sum = 0 // used to store the maximum sum 
current_sum = arr[0] // used to compute current sum 

// Traverse array starting from second element
i goes from 1 to n-1

    // Check if it is strictly increasing then we 
    // update current_sum.
    current_sum = current_sum + arr[i]

    // else strictly increasing subarray breaks and 
    // arr[i] is starting point of next potential
    // subarray
    max_sum = max(max_sum, current_sum)
    current_sum = arr[i]

return max(max_sum, current_sum) */
	
	public static int SIS(int[] arr){
		int sum=0;
		int curr=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i-1]<arr[i])
				curr=curr+arr[i];
			else{
				sum=max(curr,sum);//to save the maximum value
				curr=arr[i];
			}
				
		}
		return max(sum,curr);
	}
	public static int max(int a,int b){
		return (a>b)?a:b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,1,3,4,15,5};
		System.out.println(arr.length);
		int ans=maxSum(arr);
		int ansop=SIS(arr);
		System.out.println(ans+" "+ansop);
	}
}

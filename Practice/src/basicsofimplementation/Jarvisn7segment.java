package basicsofimplementation;
import java.util.*;
/*All over the world, peoples are working on energy solution. It would be a tough time for our next generation to survive if we don’t think about solution. Tony stark is working on a new project and wants to display his project using “seven segment display - concept”. Tony Stark gave Jarvis a task to find a number from his Favorite list of number for which the energy consumption is lowest.

(Assuming that for a digit to represent Tony stark is using 7 bulbs and only those bulbs light up which are required to represent a number and rest other would be completely off.)

Help Jarvis and conserve energy.

Seven segment display - https://en.wikipedia.org/wiki/Seven-segment_display

enter image description here

Input:
First line will contain the number of test cases and for every test case first line will contain length of favorite list and the second line for a test case will contain n numbers

Output:
For every test case print the answer. If there exist more than 1 numbers for which same number of bulbs are required than output the number which occurs first in the Favorite list.

Constraints:
Test cases< 10
A[i] < 10^6
Size of list < 10^5

SAMPLE INPUT 
1
5
1 2 3 4 5
SAMPLE OUTPUT 
1
Explanation
Number 1 needs only two bulbs to represent.
*/
//This program is not efficient
//only one case is not working 
public class Jarvisn7segment {
	public static int findMin(int a[],int n)
	{
	        int light[]={6,2,5,5,4,5,6,3,7,5};//array of lights for digits 0,1,2,3,4,5,6,7,8,9
	        int valueoflight=8; //maximum value of a 7 segment
	        
	      	int min = Integer.MAX_VALUE;
	        for(int i=0;i<n;i++)
	        {
	        	int lights=0;
	        	int bulbvalue = a[i];
	        	while(bulbvalue>=10){ //if array value is greater then 9 calculate the required numbers of bulb
	        		int nextvalue = bulbvalue%10;
	        		lights+=light[nextvalue];
	        		bulbvalue/=10;
	        		}
	        	lights+=light[bulbvalue];
	        	if(lights<min) {
	        		min=lights;
	        		valueoflight=a[i];
	        	}
	        	}
	return valueoflight;
	}


	public static void main(String[] args)
	{
	    
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    while(N>0){
	        int  n = sc.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++){
	            a[i]=sc.nextInt();
	        }    
	        System.out.println(findMin(a,n));
	        N--;
	}
	}
}



package very.very.easy;
/*
 * program to find even and odd without using Loop(using recursion)
 */

public class WithoutLoop {
	public static void withOutLoop(int num){
		if(num>0){
			if((num%2)==0){
			System.out.println(num+" is even");
			}
			else{
				System.out.println(num+" is odd");
			}
			withOutLoop(num-1);
		}
}
	public static void main(String args[]){
		int i=100;
		withOutLoop(i);
	}
}
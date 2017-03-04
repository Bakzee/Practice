package basicsofimplementation;
import java.util.*;
public class Jarvisn7segment1 {
	/*public static int compare(int a){

		if(a==1)
			return 2;
			else if(a==2)
			return 5;
			else if(a==3)
			return 5;
			else if(a==4)
			return 4;
			else if(a==5)
			return 5;
			else if(a==6)
			return 6;
			else if(a==7)
			return 3;
			else if(a==8)
			return 7;
			else if(a==9)
			return 6;
			else if(a==0)
			return 6;

			return 0;
	}
	//still not getting passed all cases
*/	public static void main(String[] args){
	int []arr = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6}; 
	Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int low =Integer.MAX_VALUE;
		while(N-->0) {//you wrote n>0 and didn't decreament the value so runtime error
			String val1="";
			int n=sc.nextInt();
			for(int i=0;i<n;i++){
			int sum=0;
			String val= sc.next();
			int strlen=val.length();
			for(int j=0;j<strlen;j++){
				int g=(int )val.charAt(j);
				sum+=arr[g-48];//to change the ascii value into numeric value
			}
			if(low>sum){
				low=sum;
				val1=val;
			}
		}
			System.out.println(val1);
	}
}
}
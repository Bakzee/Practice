/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility  classes
import java.util.*;

/*Program was asked in L&T just to find the crypto*/
class TestClass {
    private static Scanner s;
    public static int findCryp(String str1,String str2) {
    	int diff=-1;
        for(int j=0;j<str1.length();j++){
     	   int diff1;
     	   int val = (int)str1.charAt(j);
     	   int val2 = (int)str2.charAt(j);
     	   if(j==0) diff = (val2-val);
     	   else {
     		   diff1=(val2-val);
     		   if(diff!=diff1) diff=-1;
     		   else diff=diff1;
     	   }
        }
        return diff;
    }

	public static void main(String args[] ) throws Exception {
        s = new Scanner(System.in);
        int N = s.nextInt();
        for (int i = 0; i < N; i++) {
           String str1 = s.next();
           String str2 = s.next();  
           System.out.println(findCryp(str1, str2));
        }
        s.close();
	}
}

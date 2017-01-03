package hackerEarth;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility  classes
import java.util.*;

class CountDivisibleByk {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int j=s.nextInt();
        int k=s.nextInt();
        int count=0;
        System.out.println((j/k)-((i-1)/k));
        while(i<=j){//O(n) method
            if((i%k)==0)
                ++count;
            i++;
        }
        //can be solved in o(1) time: 1 to r values divided by k = r/k
        
        System.out.println(count);
    }
}

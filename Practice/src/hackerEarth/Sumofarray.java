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


class Sumofarray {
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
        int N = s.nextInt();
        int[] a= new int[N];
        for (int i = 0; i < N; i++) {
            a[i]=s.nextInt();
        }
        System.out.println(arrayProduct(a));
    }
    public static int arrayProduct(int[] a){
        int res=a[0];
        for(int i=1;i<a.length;i++)
            res=(int) ((res*a[i])%(Math.pow(10,9)+7));
        return res;
    }
}

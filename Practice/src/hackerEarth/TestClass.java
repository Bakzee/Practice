package hackerEarth;
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


class TestClass {
    public static float findSum(int num){
        float sum=1;
        for(int i=2;i<=(num/2);i++){
            if((num%i)==0)
                sum+=i;
        }
        return sum/num;
    }
    public static int findMin(float[] arr){
        int len=arr.length;
        int index=0;
        for(int i=1;i<len;i++){
            if(arr[index]>arr[i])
                index=i;
        }
        return index;        
    }
    public static void main(String args[] ) {
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

        for (int i = 0; i < N; i++) {
            int a=s.nextInt();
            int b=s.nextInt();
            int n=b-a;
            int preva=a;
            float[] arr= new float[n];
            for(int j=0;j<n;j++){
                arr[j]=findSum(a);
                
				a++;
            }
            int val=findMin(arr);
            System.out.println(preva+val);
        }

    }
}

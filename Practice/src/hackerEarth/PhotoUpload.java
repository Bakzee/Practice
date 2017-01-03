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


class PhotoUpload {
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
        int l = s.nextInt();
        int N = s.nextInt();
        int w;
        int h;
        for (int i = 0; i < N; i++) {
            w=s.nextInt();
            h=s.nextInt();
            if(w<l || h<l )
                System.out.println("UPLOAD ANOTHER");
            else{
                if(w==h)
                    System.out.println("ACCEPTED");
                else
                System.out.println("CROP IT");
        }
        }
   }
}

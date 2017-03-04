package hackerEarth;

import java.util.Scanner;

class CheckInteger {
	public static int checkInteger(String str,int i){
		int count=0;
            for(int j=0;j<str.length();j++){
            	int val=(int)str.charAt(j);
            	//System.out.println(val);
            	if(i==val) 
            	count++;
            }
        return count;
	}
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
        String str = s.nextLine();
        int a=0;
        for (int i = 48; i < 58; i++) {
        	int count=checkInteger(str,i);
            System.out.println(a+++" "+count);
        //System.out.println("Hello World!");
    }
}
}
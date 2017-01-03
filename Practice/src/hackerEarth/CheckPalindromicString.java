package hackerEarth;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class CheckPalindromicString{
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(palindromeCheck(line.toCharArray())?"YES":"NO");
    }
    public static boolean palindromeCheck(char [] arr)
    {
        int startIndex=0;
        int lastIndex=arr.length-1;
        while(lastIndex>startIndex)
        {
            if(arr[startIndex]!=arr[lastIndex])
                return false;
            ++startIndex;
            --lastIndex;
        }
        return true;
    }
}

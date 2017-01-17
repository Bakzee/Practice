package hackerEarth;

public class MagicalNumber {
	public static boolean isPrime(int val){
        if((val%2)==0) return false;
        for(int i=3;i<val;i++){
            if((val%i)==0) return false;
        }
        return true;
    }
	public static void checkMagicalString(String str){
		for(int i=0;i<str.length();i++){
			int ascii =(int)str.charAt(i);
			int ascii1=ascii;
			int ascii2=ascii;
			while(isPrime(ascii1)==false) {
				ascii1++;
			}
			while(isPrime(ascii2)==false) {
				ascii2--;
			}
			if((ascii1-ascii)<(ascii-ascii2)) System.out.print((char)ascii1);
			else System.out.print((char)ascii2);
		}
	}

	public static void main(String[] args) {
		String str="AFREEN";
		checkMagicalString(str);
	}

}

package hackerEarth;

public class Maxfind {
	public static int findMax(int[] a){
	    int i,j;
	    int max=0;
	    for(i=0;i<a.length-1;i++)
	        for(j=i+1;j<a.length;j++){
	            if((a[i]==a[j])&&(max<(j-i)))
	                    max=j-i;
	    }
	    return max;
	}
	    
	   public static void main(String args[]){
		   int[] a= new int[]{3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 9 };
		   System.out.println(findMax(a));
	   }
}

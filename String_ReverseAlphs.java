/******************************************************************************

                    Reverse Alphabets in a String

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="12Ad&a";
	    char [] a=str.toCharArray();
	    int i=0,j=str.length()-1;
	    while(i<j){
	        if(!Character.isAlphabetic(a[i]))
	            i++;
	       else if(!Character.isAlphabetic(a[j]))
	            j--;
	       else{
	            char t=a[i];
	            a[i]=a[j];
	            a[j]=t;
	            i++;
	            j--;
	        }
	    }
	    System.out.print(a);
	}
}
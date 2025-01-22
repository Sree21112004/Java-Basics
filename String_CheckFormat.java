/******************************************************************************

                                Check the format

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int l=0,u=0;
	    char [] a=str.toCharArray();
	    for(int i=0;i<str.length();i++){
	        if(Character.isLowerCase(a[i])){
	            l++;
	        }
	        else if(Character.isUpperCase(a[i])){
	            u++;
	        }
	    }
	    if(u==str.length()||l==str.length() ||l==str.length()-1 && Character.isUpperCase(str.charAt(0))){
	        System.out.print("True");
	    }
	    else
	   System.out.print("False");
}
}
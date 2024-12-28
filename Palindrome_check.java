/******************************************************************************

                            Palindrome Check

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    int temp=num;
	    int rev=0;
	    while(num!=0){
	        rev=rev*10+num%10;
	        num/=10;
	    }
	    if(temp==rev){
	        System.out.print("Number is palindrome");
	    }
	    else{
	        System.out.print("Number is not a palindrome");
	    }
	}
}
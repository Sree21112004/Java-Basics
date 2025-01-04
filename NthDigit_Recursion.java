/******************************************************************************

                        Get Nth digit - Recursion

*******************************************************************************/

import java.util.*;
public class Main
{
    public static int getDigit(int number,int n){
       if(n==1){
           return number%10;
       }
       return getDigit(number/10,n-1);
    }
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	      int number=sc.nextInt();
	      int n=sc.nextInt();
	      int result=getDigit(number,n);
	      System.out.print(result);
	      
	}
}
/******************************************************************************

                            Nth Fibbonicci - Recursion

*******************************************************************************/

import java.util.*;
public class Main
{
    static int fib_num=0;
    public static int fib(int n){
       
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2) ;
    }
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	      int num=sc.nextInt();
	      System.out.print(fib(num));
	      
	}
}
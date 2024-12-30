/******************************************************************************

                            Fibbonacci Series

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fib_1=0,fib_2=1,fib_3=0;
		System.out.print(fib_1+ " "+fib_2+" ");
	    for(int i=1;i<num;i++){
	        fib_3=fib_1+fib_2;
	        fib_1=fib_2;
	        fib_2=fib_3;
	        System.out.print(fib_3+" ");
	    }
	}
}
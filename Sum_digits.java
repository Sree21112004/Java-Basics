/******************************************************************************

                        Sum of digits (while loop)

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    int sum=0;
	    while(num!=0){
	        int rem=num%10;
	        sum=sum+rem;
	        num/=10;
	    }
	    System.out.print(sum);
	    	}
}
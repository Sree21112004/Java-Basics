/******************************************************************************

                            GCD of numbers

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int min=Math.min(num1,num2);
		int gcd=0;
		for(int i=min;i>0;i--){
		    if(num1%i==0 && num2%i==0){
		        gcd=i;
		        break;
		    }
		}
		System.out.print("GCD of "+num1+" and "+num2+" is "+gcd);
	}
}
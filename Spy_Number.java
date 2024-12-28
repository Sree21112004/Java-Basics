/******************************************************************************

                                Spy Number

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int prod=1;
		while(temp!=0){
		    int dig=temp%10;
		    sum+=dig;
		    prod*=dig;
		    temp/=10;
		}
		if(sum==prod){
		    System.out.println("Yes, It's a Spy Number");
		}
		else{
		    System.out.println("Not a Spy Number");
		}
	}
}
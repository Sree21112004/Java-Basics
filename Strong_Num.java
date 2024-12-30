/******************************************************************************

                            Strong Number

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num!=0){
		    int rem=num%10;
		    int fact=1;
		    for(int i=1;i<=rem;i++){
		        fact=fact*i;
		    }
		    sum=sum+fact;
		    num/=10;
		}
		if(temp==sum){
		    System.out.print("Strong Number");
		}
		else{
		    System.out.print("Not a strong number");
		}
	}
}
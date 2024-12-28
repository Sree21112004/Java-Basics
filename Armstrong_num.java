/******************************************************************************

                            Armstrong Number

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0,temp=num;
		int arm=0;
	    while(num!=0){
	        count++;
	        num/=10;
	    }
	    num=temp;
	    while(temp!=0){
	        int rem=temp%10;
	        arm=arm+(int)Math.pow(rem,count);
	        temp/=10;
	    }
	    if(arm==num){
	        System.out.println("Armstrong Number");
	    }
	    else{
	        System.out.println("Not an Arnstrong number");
	    }
	    
	}
}
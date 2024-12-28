/******************************************************************************

                            Neon Number
                            
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int squ=num*num;
		while(squ!=0){
		    int rem=squ%10;
		    sum+=rem;
		    squ/=10;
		}
		if(sum==num){
		    System.out.println("Neon Number");
		}
		else{
		    System.out.println("Not a neon number");
		}
	}
}
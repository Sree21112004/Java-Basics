/******************************************************************************

                            Perfect Number

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++){
		    if(num%i==0){
		        sum=sum+i;
		    }
		}
		System.out.println(sum);
		if(sum==num){
		    
		    System.out.print("Perfect Number");
		}
		else if(sum>num){
		    System.out.print("Abundant Number");
		}else{
		    System.out.print("Deficient Number");
		}
	}
}
/******************************************************************************

                            Automorphic Number
                            
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sq=num*num;
		int flag=0;
		while(num>0){
		    int rem_num=num%10;
		    int rem_sq=sq%10;
		    if(rem_num!=rem_sq){
		        flag=1;
		        break;
		        }
		        num/=10;
		        sq/=10;
		 }
		 if(flag==0){
		     System.out.print("Automorphic Number");
		 }
		 else{
		     System.out.println("Not an Automorphic Number");
		 }
	}
}
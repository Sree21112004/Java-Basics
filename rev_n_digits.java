/******************************************************************************

                            Reverse n digits

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev_count=sc.nextInt();
		int count=0;
		String str="",rev="";
		while(count<rev_count){
		    count++;
		    rev=rev+(num%10);
		    num/=10;
		}
    str=num+rev;
		System.out.print(str);
		
	}
}
/******************************************************************************

                            Find LCM

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int max=(num1>num2)?num1:num2;
		int lcm=0;
		for(int i=max;i<=num1*num2;i++){
		    if(i%num1==0 && i%num2==0){
		        lcm=i;
		        break;
		    }
		}
		System.out.print("The LCM is: "+lcm);
	}
}
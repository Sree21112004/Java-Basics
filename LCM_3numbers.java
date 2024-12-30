/******************************************************************************

                            Find LCM of 3 numbers

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int max1=(num1>num2)?num1:num2;
		int max2=(max1>num3)?max1:num3;
		int lcm=0;
		for(int i=max2;i<=num1*num2*num3;i++){
		    if(i%num1==0 && i%num2==0 && i%num3==0){
		        lcm=i;
		        break;
		    }
		}
		System.out.print("The LCM is: "+lcm);
	}
}
/******************************************************************************

Greatest among 3 numbers using ternary operator

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num1=sc.nextInt();
	    int num2=sc.nextInt();
	    int num3=sc.nextInt();
	    int tempgreatest=(num1>num2)?num1:num2;
	    int greatest=(tempgreatest>num3)?tempgreatest:num3;
		System.out.println("The greatest number is: "+greatest);
	}
}
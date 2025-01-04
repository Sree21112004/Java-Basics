/******************************************************************************

                            Recursion

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int revNum(int num,int reversed){
        if(num==0){
            return reversed;
        }
        return revNum(num/10,reversed*10+num%10);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int number=sc.nextInt();
	    int reversed=revNum(number,0);
		System.out.println("The reversed number is: "+reversed);
	}
}
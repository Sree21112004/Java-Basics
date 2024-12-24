/******************************************************************************

Check a number is divisible by 3 & 5

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    if(num%3==0 && num%5==0){
        System.out.print(num + " is divisible by both 3 and 5");
    }
	}
}
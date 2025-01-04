/******************************************************************************

                        LCM, GCD - Recursion

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int GCD(int num1,int num2){
        if(num2==0){
            return num1;
        }
        return GCD(num2,num1%num2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int gcd=GCD(num1,num2);
        System.out.println("GCD: "+gcd);
        int lcm=(num1*num2)/gcd;
        System.out.println("LCM: "+lcm);
    }
}
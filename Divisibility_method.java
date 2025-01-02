/******************************************************************************

                        Methods/Functions (divisibility)

*******************************************************************************/
import java.util.*;
public class Main{
    public static void check_div(int a, int b){
        if(a%b==0){
            System.out.println(a+" is divible by "+b);
        }else{
            System.out.println(a+" is not divisible by "+b);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        check_div(10,2);
        check_div(30,7);
    }
}
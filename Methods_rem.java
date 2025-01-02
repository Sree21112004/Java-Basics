/******************************************************************************

                        Methods/Functions (remainder)

*******************************************************************************/
import java.util.*;
public class Main{
    public static int cal_rem(){
        int dividend=29, divisor=5;
        return dividend % divisor;
    }
    public static void main(String[] args){
        int remainder=cal_rem();
        System.out.print("Remainder of 29 and 5 is "+remainder);
    }
}
/******************************************************************************

While loop example

*******************************************************************************/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int guess_num=5;
        while(true){
            System.out.print("Enter another number : ");
            int val= sc.nextInt();
            if(val==guess_num){
                System.out.print("Correct");
                break;
            }
        }
    }
}
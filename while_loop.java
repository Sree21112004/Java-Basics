/******************************************************************************

Print even numbers of a range

*******************************************************************************/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
            if(i%2==0){
                System.out.printf("%d ",i);
            }
            i++;
        }
    }
}
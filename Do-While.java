/******************************************************************************

Do-While loop example

*******************************************************************************/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int i=5;
        do{
            System.out.print(i);
            i++;
        }while(i<=4);
    }
}
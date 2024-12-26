/******************************************************************************

Pattern example 1

*******************************************************************************/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int i,j;
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
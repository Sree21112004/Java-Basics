/******************************************************************************

                                   Pattern
                                 
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for(int i=1;i<=r;i++){
		    for(int j=i;j<=r;j++){
		        System.out.print("  ");
		    }
		    for(int j=0;j<i;j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
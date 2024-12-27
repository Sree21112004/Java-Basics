/******************************************************************************

                            Right Pascal's Triangle

*******************************************************************************/
import java.util.*;
public class Pattern_6
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for(int i=0;i<r;i++){
		    for(int j=i;j<r;j++){
		        System.out.print("  ");
		    }
		    for(int j=0;j<i;j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		for(int i=0;i<r;i++){
		    for(int j=0;j<i;j++){
		        System.out.print("  ");
		    }
		    for(int j=i;j<r;j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
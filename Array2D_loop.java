/******************************************************************************

                                2D Arrays - Loop 

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int[][] x=new int[2][2];
		x[0][0]=1;
		x[0][1]=2;
		x[1][0]=3;
		x[1][1]=4;
        for(int r=0;r<x.length;r++){
            for(int c=0;c<x[0].length;c++){
                System.out.print(x[r][c]+" ");
            }
        }
	}
}
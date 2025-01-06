/******************************************************************************

                                2D Arrays - i/o

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
		int[][] x=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                x[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
	}
}
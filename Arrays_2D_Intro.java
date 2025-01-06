/******************************************************************************

                                Arrays - 2D

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int size=2;
		int[][] arr=new int[size][size];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[1][0]=3;
        arr[1][1]=4;
		System.out.println(arr[0][0]+ " "+ arr[0][1]+ " "+arr[1][0]+" "+arr[1][1]);
	}
}
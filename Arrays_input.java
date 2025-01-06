/******************************************************************************

                                Arrays - Intro

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int size=sc.nextInt();
		int[] x={1,2,3};
		float[] y={1.0f,2.0f,3.0f};
		char[] z={'A','B','C'};
		String[] w={"Hi","Hello","Hru"};
		int n=w.length;
		System.out.printf("%d %d %d %d\n",x[0],x[1],x[2],x.length);
		System.out.printf("%.2f %.2f %.2f %d\n",y[0],y[1],y[2],y.length);
		System.out.printf("%c %c %c %d\n",z[0],z[1],z[2],z.length);
		for(int i=0;i<n;i++){
		    System.out.print(w[i]+" ");
		}
	    System.out.println();
	    int[] array=new int[size];
		for(int i=0;i<size;i++){
		    array[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
		    System.out.print(array[i]+" ");
		}
	}
}
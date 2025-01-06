/******************************************************************************

                                Arrays - Intro

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int[] x={1,2,3};
		float[] y={1.0f,2.0f,3.0f};
		char[] z={'A','B','C'};
		String[] w={"Hi","Hello","Hru"};
		System.out.printf("%d %d %d %d\n",x[0],x[1],x[2],x.length);
		System.out.printf("%.2f %.2f %.2f %d\n",y[0],y[1],y[2],y.length);
		System.out.printf("%c %c %c %d\n",z[0],z[1],z[2],z.length);
		int n=w.length;
		for(int i=0;i<n;i++){
		    System.out.print(w[i]+" ");
		}
	}
}
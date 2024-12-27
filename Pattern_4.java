/******************************************************************************

                        Pascal's Right half triangle

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for(int i=1;i<=r;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		for(int i=1+1;i<=r;i++){    
		    for(int j=i;j<=r;j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		
	}
}
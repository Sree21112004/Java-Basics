/******************************************************************************

                            Arrays - Sum of elements

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size:");
	    int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++){
		    arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<size;i++){
		    sum+=arr[i];
		}
		System.out.println(sum);
	}
}
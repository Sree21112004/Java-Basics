/******************************************************************************

                            Kth smallest number

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size = sc.nextInt();
    int[] arr=new int[size];
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    for(int i=0;i<size;i++){
    System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println("Enter the k value");
    int k=sc.nextInt();
    System.out.println("Kth smallest element: "+arr[k-1]);
	}
}
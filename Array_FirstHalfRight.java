/******************************************************************************

                        First Half - Right Rotation

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void rev(int arr[],int s_pos,int e_pos){

	    while(s_pos<e_pos){
	        int temp=arr[s_pos];
	        arr[s_pos]=arr[e_pos];
	        arr[e_pos]=temp;
	        s_pos++;
	        e_pos--;
	    }
	}
	public static void rotate(int arr[], int fhs, int rev_pos){
	    	rev(arr,0,fhs-1);
		rev(arr,0,rev_pos-1);
		rev(arr,rev_pos,fhs-1);
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
		int rev_pos=sc.nextInt();
		int len=arr.length;
		int mid=len/2;
		int fhs=len-mid;
		rotate(arr,fhs,rev_pos);
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
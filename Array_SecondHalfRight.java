/******************************************************************************

                        Seond Half - Right Rotation

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
	public static void rotate(int arr[], int len, int rev_pos){
	    int mid=len/2;
		int shs=len-mid;
		rev_pos=rev_pos%shs;
		rev(arr,mid,len-1);
		rev(arr,mid,mid+rev_pos-1);
		rev(arr,mid+rev_pos,len-1);
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
		Scanner sc=new Scanner(System.in);
		int rev_pos=sc.nextInt();
		int len=arr.length;
		rev_pos=rev_pos%len;
		rotate(arr,len,rev_pos);
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
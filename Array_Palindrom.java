/******************************************************************************

                            Palindrom Check

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String[] args){
    int arr[]={1,2,3,2,1};
    int len=arr.length;
    int left=0;
    boolean isPal=true;
    int right=len-1;
    int i=0;
    while(left<right){
        if(arr[left]!=arr[right]){
            isPal=false;
            break;
        }
        left++;
        right--;
    }
    for(i=0;i<len;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    if(isPal==true){
        System.out.print("Palindrom");
    }else{
        System.out.print("Not Palindrom");
    }
}

}
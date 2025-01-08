/******************************************************************************

                            Move zeros to last

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String[] args){
        int j=0;
        int arr[]={1,0,3,0,5};
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=j;i<arr.length;i++){
            arr[j]=0;
            j++;
        }
        for(j=0;j<arr.length;j++){
            System.out.print(arr[j]+ " ");
        }
    }
}
/******************************************************************************

                            Max and Min Elements

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String[] args){
    int max=0;
    int arr1[]={1,2,3,4,5};
    int min=arr1[0];
    for(int i=0;i<arr1.length;i++){
        if(arr1[i]>max){
            max=arr1[i];
        }
        if(arr1[i]<min){
            min=arr1[i];
        }
    }
    System.out.println("Max element: "+max);
    System.out.print("Min element: "+min);
}

}
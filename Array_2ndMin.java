/******************************************************************************

                                2nd Min Elements

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String[] args){
    int min=0;
    int arr1[]={-200,14,6,-2,-200,8,10};
    int temp=0;
    for(int i=0;i<arr1.length;i++){
        if(arr1[i]<min){
            temp=min;
            min=arr1[i];
        }else if(arr1[i]<temp && arr1[i]!=min){
            temp=arr1[i];
        }
    }
    System.out.println("Second Min element: "+temp);
    
}

}
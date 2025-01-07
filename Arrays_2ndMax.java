/******************************************************************************

                            2nd Max Elements

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String[] args){
    int max=0;
    int arr1[]={-200,14,6,-2,14,8,10};
    int temp=0;
    for(int i=0;i<arr1.length;i++){
        if(arr1[i]>max){
            temp=max;
            max=arr1[i];
        }else if(arr1[i]>temp){
            temp=arr1[i];
        }
    }
    System.out.println("Second Max element: "+temp);
    
}

}
/******************************************************************************

                        Checking for same elements    

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String[] args){
    int arr1[]={1,2,3,4,5};
    int arr2[]={5,4,3,2,1};
    boolean status=true;
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    if(arr1.length==arr2.length){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                status=false;
                break;
            }
        }
    }else{
        status=false;
    }
    System.out.print(status);
}

}
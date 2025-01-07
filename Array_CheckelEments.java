/******************************************************************************

                Checking for same elements  - default function   

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String[] args){
    int arr1[]={1,2,3,4,5};
    int arr2[]={5,4,3,2,1};
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    boolean status=Arrays.equals(arr1,arr2);
    System.out.print(status);
}

}
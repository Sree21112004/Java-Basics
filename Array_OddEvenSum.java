/******************************************************************************

                        Sum of odd/even elements    

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    int sumEven=0,sumOdd=0;
    for(int i=1;i<arr.length;i++){
        if(arr[i]%2==0){
            sumEven+=arr[i];
        }else{
            sumOdd+=arr[i];
        }
    }
    System.out.println("Sum of even values: "+sumEven);
    System.out.println("Sum of even values: "+sumOdd);
	}
}
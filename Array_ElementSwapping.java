/******************************************************************************

                                Elements Swapping

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int arr[]={1,2,3,4,5};
    int pos1=sc.nextInt();
    int pos2=sc.nextInt();
    int temp=arr[pos1];
    arr[pos1]=arr[pos2];
    arr[pos2]=temp;
    
    if(pos1<0||pos2<0||pos1>=arr.length||pos2>=arr.length){
        System.out.print("Invalid");
        return;
    }
    
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    
}

}
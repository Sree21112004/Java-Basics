/******************************************************************************

Loops (For, While and Do-While)

*******************************************************************************/

import java.util.*;
public class loops
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        String str = sc.next();
	    System.out.println("For loop");
	    for (int i=0;i<5;i++){
	        System.out.print(str + " ");
	    }
	    System.out.println();
	    
	    System.out.println("While loop");
	    int i=1;
	    while(i<10){
	        System.out.print( str + " ");
	        i++;
	    }
	    System.out.println();
	    
	    System.out.println("Do-While loop");
	    int j=10;
	    do{
	        System.out.print(str+" ");
	        j++;
	    }while(j<5);
	}
	
}
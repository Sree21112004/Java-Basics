/******************************************************************************

Switch Cases

*******************************************************************************/
import java.util.*;
public class Main {
    public static void main(String[] args) {
    	//calculator//
    	Scanner sc= new Scanner(System.in);
		System.out.println("calculator");
		char h = sc.next().charAt(0);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		switch(h){
		    case '+':
		        System.out.println("Add: "+ (n1+n2));
		        break;
		    case '-':
		        System.out.println("Sub: " + (n1-n2));
		        break;
		    case '/':
		        System.out.println("div: "+ (n1/n2));
		        break;
		    case '*':
		        System.out.println("mul: " + (n1*n2));
		        break;
		    default:
		        System.out.println("Invalid");
		        break;
		}    
    }
}
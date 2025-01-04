/******************************************************************************

                        Check for prime - Recursion

*******************************************************************************/

public class Main
{
    static Boolean checkPrime(int n, int i){
        if(i==n){
            return true;
        }
        if(n%i==0){
            return false;
        }
        return checkPrime(n,i+1);
    }
	public static void main(String[] args) {
		int n=6;
		int i=2;
		boolean isprime=checkPrime(n,i);
		if(isprime==true){
		    System.out.print("Prime Number");
		}else{
		    System.out.print("Composite Number");
		}
	}
}
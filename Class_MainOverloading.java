/******************************************************************************

                        Method Overloading - Main

*******************************************************************************/

public class Main
{
    public int main(int x){
        int s;
        s=x*x;
        return s;
    }
    
	public static void main(String[] args) {
	   Main m=new Main();
	   System.out.print(m.main(12));
	}
}
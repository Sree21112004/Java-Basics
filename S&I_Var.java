/******************************************************************************

                        Instance, Static Variable

*******************************************************************************/

public class Main
{
    int y=123;
	void method1(){
	    int x=111;
	    System.out.println("Mtd-1 x : "+x );
	    System.out.println("Mtd-1 y : "+y );
	}
	void method2(){
	    //System.out.println("Mtd-2 x : ",x);
	    System.out.println("Mtd-2 y : "+y);
	}
	public static void main(String[] args){
	    Main d=new Main();
	    d.method1();
	    d.method2();
	    System.out.println("Main y : "+d.y);
	}
}
/******************************************************************************

                        Static, Method Variable

*******************************************************************************/

public class Main
{
    static int staticVar=999;
	public static void staticMethod(){
	    System.out.println("Instance Variable : "+staticVar );
	}
	public void instanceMethod(){
	    System.out.println("Static Variable in instance method: "+staticVar);
	    staticMethod();
	    Main.staticMethod();
	}
	public static void main(String[] args){
	    Main obj=new Main();
        obj.instanceMethod();
	}
}
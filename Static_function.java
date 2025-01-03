/******************************************************************************

                            Static function

*******************************************************************************/

public class Main
{
    static int staticVar=678;
    public static void methodOne(){
        System.out.println("Inside MethodOne");
        System.out.println("Static Variable "+staticVar);
    }
    public static void methodTwo(){
        System.out.println("Inside MethodTwo");
        methodOne();
        Main.methodOne();
    }
	public static void main(String[] args) {
		Main.methodTwo();
	}
}
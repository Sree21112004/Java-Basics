/******************************************************************************

                            Static Variable

*******************************************************************************/

public class Main
{
    static int staticVar=88;
	public static void main(String[] args) {
		System.out.println("Accessing staticVar using class name: "+staticVar);
		System.out.println("Accessing staticVar using class name: "+Main.staticVar);
	}
}
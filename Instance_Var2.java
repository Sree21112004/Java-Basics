/******************************************************************************

                            Instance Variable

*******************************************************************************/

public class Main
{
    int instanceVar;
	public static void main(String[] args) {
		Main obj1=new Main();
		obj1.instanceVar=10;
		System.out.println("Obj1 instanceVar : "+obj1.instanceVar);
		
		Main obj2=new Main();
		System.out.println("Obj2 instanceVar : "+obj2.instanceVar);
		
		obj2.instanceVar=30;
		System.out.println("Obj2 instanceVar : "+obj2.instanceVar);
	}
}
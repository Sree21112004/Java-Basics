/******************************************************************************

                        Instance, Static, Method Variable

*******************************************************************************/

public class Main
{
    int instanceVar=888;
	public void display(){
	    System.out.println("Instance Variable : "+instanceVar );
	}
	public void greet(){
	    System.out.println("Hello from greet method!");
	    display();
	}
	public static void main(String[] args){
	    Main obj=new Main();
	    obj.display();
	    obj.greet();
	}
}
/******************************************************************************

                            Explicit Type Conversion

*******************************************************************************/

public class Main
{
    public void method1(byte b){
        System.out.println("byte:"+b);
    }
    public void method1(short s){
        System.out.println("short:"+s);
    }
    public void method1(int i){
        System.out.println("int:"+i);
    }
	public static void main(String[] args) {
	    Main m=new Main();
		m.method1((byte)10);
		m.method1((short)100);
		m.method1(1000);
	}
}
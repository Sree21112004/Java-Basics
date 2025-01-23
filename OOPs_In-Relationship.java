/******************************************************************************

                            OOPs - In-Relationship

*******************************************************************************/
class SuperA
{
    private int x=100;
    int y=222;
    static int z=333;
    public void display1(){
        System.out.println("display method from SuperA");
    }
}
class sub extends SuperA{
    public void display2(){
        System.out.print("Display method from sub class");
    }
}
public class Main{
    public static void main(String args[]){
        sub b=new sub();
        System.out.println("y val is : "+b.y);
        System.out.println("z val is : "+b.z);
        System.out.println("z val : "+SuperA.z);
        System.out.println("z val : "+sub.z);
        b.display1();
        b.display2();
    }
}
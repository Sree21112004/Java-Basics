/******************************************************************************

                            Constructor

*******************************************************************************/

public class calc
{
    public calc(int a,int b){
        System.out.println(a+b);
    }
    public calc(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public calc(String a,String b){
        System.out.println(a+b);
    }
    public calc(double a,double b){
        System.out.println(a+b);
    }
	public static void main(String[] args) {
        calc c1=new calc(10,20);
        calc c2=new calc(10,20,30);
        calc c3=new calc("hello","world");
        calc c4=new calc(10.0,20.0);
	}
}
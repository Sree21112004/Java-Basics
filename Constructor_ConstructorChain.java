/******************************************************************************

                            Constructor Chain

*******************************************************************************/

public class calc
{
    public calc(int a,int b){
        System.out.println(a+b);
    }
    public calc(int a,int b,int c){
        this(5,5);
        System.out.println(a+b+c);
    }
    public calc(String a,String b){
        this(5,5,5);
        System.out.println(a+b);
    }
    public calc(double a,double b){
        this("hello","world");
        System.out.println(a+b);
    }
	public static void main(String[] args) {
        calc c1=new calc(5.0,5.0);
	}
}
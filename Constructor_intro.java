/******************************************************************************

                            Constructor

->Constructor name and class name must be StackTraceElement
->Constructor can be parameterized
->Constructor can be overloaded
->Execution order is always from top to bottom
->Never returns any value

->Types -Default Constructor
        -Parameterized Constructor
        -Copy Constructor
*******************************************************************************/

public class Rect
{
    float l,b;
    Rect(){
        l=4.0f;
        b=4.0f;
    }
    public float findArea(){
        return l*b;
    }
	public static void main(String[] args) {
        Rect r=new Rect();
        float res=r.findArea();
        System.out.print(res);
	}
}
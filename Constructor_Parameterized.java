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
    Rect(float l, float b){
        this.l=l;
        this.b=b;
    }
    public float findArea(){
        return l*b;
    }
	public static void main(String[] args) {
        Rect r=new Rect(4.0f,4.0f);
        float res=r.findArea();
        System.out.print(res);
	}
}
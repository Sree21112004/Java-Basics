/******************************************************************************

                            String - Constructor

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		String s3=new String("Sai");
		String s4=new String("Sai");
		if(s3==s4){
		    System.out.println("Object ref are same");
		}else{
		    System.out.println("Object ref are not same");
		}
		
		if(s3.equals(s4)){
		    System.out.println("Content are same");
		}else{
		    System.out.println("Content are not same");
		}
	}
}
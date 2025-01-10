/******************************************************************************

                        String - Palindrome Check

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		String str="MadaM";
		StringBuffer str_buf=new StringBuffer(str);
		str_buf.reverse();
		System.out.println(str_buf);
		String rev=str_buf.toString();
		if(str.equals(rev)){
		    System.out.print("Palindrome");
		}else{
		    System.out.print("Not Palindrome");
		}
	}
}
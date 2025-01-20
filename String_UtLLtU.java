/******************************************************************************

                    Upper to LowerCase and Lower to UpperCase

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="HellO woRLd";
		StringBuffer res=new StringBuffer();
		for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);
		    if(ch>='A' && ch<='Z'){
		        ch=(char)(ch+32);
		    }
		    else if(ch>='a' && ch<='z'){
		        ch=(char)(ch-32);
		    }
		    res.append(ch);
		}
		System.out.print(res);
	}
}
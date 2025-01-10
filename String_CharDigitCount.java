/******************************************************************************

                        String - Character and Digit Count

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		String str="Born 2 Win";
		str=str.replace(" ","");
		int uc=0;
		int lc=0;
		int dc=0;
		int sc=0;
		for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);
		    if(ch>='A' && ch<='Z'){
		        uc++;
		    }else if(ch>='a' && ch<='z'){
		        lc++;
		    }else if(ch>='0' && ch<='9'){
		        dc++;
		    }
		    else{
		        sc++;
		    }
		}
		System.out.printf("UpperCase: %d\nLowerCase: %d\nDigits: %d\nSpecial Chars: %d",uc,lc,dc,sc);
	}
}
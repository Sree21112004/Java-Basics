/******************************************************************************

                        String - Remove Vowels

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		String str="Madam";
		String str1="";
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);
		    if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){
		        str1+=ch;
		    }
		}
		System.out.print(str1);
	}
}
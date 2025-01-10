/******************************************************************************

                            String Buffer

public int length() - return no. of characters
public int capacity() - return capacity of StringBuffer object
public StringBuffer append(zzz) - add the content to previous word
public StringBufferinsert(int,zzz) - insert specified value at specified index
public StringBuffer deleteCharAt(int) - delete character at specified index
public StringBuffer replace(int, int, String)
public StringBuffer reverse()
*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println("Original StringBuffer: "+sb);
		System.out.println(sb.hashCode());
		sb.append(" World");
		System.out.println("Original StringBuffer: "+sb);
		System.out.println(sb.hashCode());
	}
}
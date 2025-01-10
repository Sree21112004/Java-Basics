/******************************************************************************

                            String - Introduction

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="Hello";
		System.out.println("Original String : "+s);
		System.out.println("Hashcode of original string : "+s.hashCode());
		s=s+"World";
		System.out.println("Updated String : "+s);
		System.out.println("Hashcode of original string is : "+s.hashCode());
	}
}
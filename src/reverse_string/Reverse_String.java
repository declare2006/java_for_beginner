package reverse_string;
//import java.util.Scanner;

public class Reverse_String {
	
	static String reverse_str(String str1)
	{
		String concatstr="";
		int size=str1.length();
		int i;
	//	System.out.println("the 20nd character is "+str1.charAt(20));
	//	System.out.println("the 19th character is "+str1.charAt(19));
		for (i=0;i<size;i++)
		{
			System.out.println(str1.charAt(size-i-1));
			concatstr=concatstr+str1.charAt(size-i-1);
		}
		return concatstr;
		
	}
	
	public static void main( String[] args )
	{ 
	//	
		System.out.println(reverse_str("wu cheng yu fred"));
		
	}

}

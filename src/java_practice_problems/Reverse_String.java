package java_practice_problems;
import java.util.*;
public class Reverse_String 
{
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		System.out.print("Enter String=");
		String d=cin.nextLine();
		//System.out.print(d);
		reverse(d);
	}
	private static void reverse(String d)
	{
		if(d=="") 
		{
			System.out.print(d);
		}
		else
		{
			//StringBuilder s=new StringBuilder(d);
			//StringBuilder a=s.reverse();
			//System.out.print(a);
			//-------------------------------------------//
			StringBuffer s=new StringBuffer(d);
			String a=s.reverse().toString();
			System.out.print(a);
			//-------------------------------------------//	
		}
		
	}
	
}

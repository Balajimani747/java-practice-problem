package java_practice_problems;
import java.util.*;

public class Adding_Binary_Number {
	public static void main(String[] arg) 
	{
	Scanner cin=new Scanner(System.in);
	System.out.print("Enter First Binary Number=");
	String A=cin.next();
	System.out.print("Enter Second Binary Number=");
	String B=cin.next();
	System.out.print("Enter Addision Binary Number="+Stingtobinaru(A,B));
	}

	static String Stingtobinaru(String a, String b) {
		int num1=Integer.parseInt(a, 2);
		int num2=Integer.parseInt(b, 2);
		int num3=num1+num2;
		String result=Integer.toBinaryString(num3);
		return result;
		
	}
}

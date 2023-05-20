package java_practice_problems;
import java.util.*;
public class Conert_numbertobinary {
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		System.out.print("Enter Decimal Number=");
		int a=cin.nextInt();
		String g=Decimaltobinary(a);
		System.out.print(g);
		
	}
	 static String Decimaltobinary(int A) {
		 String B=Integer.toBinaryString(A);
		return B;
	}
	

}

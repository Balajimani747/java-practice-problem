package java_practice_problems;
import java.util.*;
public class Swap_of_two_numbers {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		System.out.print("Enter Number-A=");
		int A=cin.nextInt();
		System.out.print("Enter Number-B=");
		int B=cin.nextInt();
		
		System.out.println("Befor Swapping: A="+A+" And "+"B="+B);
		
		int tem;
		tem=A;
		A=B;
		B=tem;
		
		System.out.print("After Swapping: A="+A+" And "+"B="+B);
		
	}

}

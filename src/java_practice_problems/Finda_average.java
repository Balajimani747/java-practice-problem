package java_practice_problems;
import java.util.Scanner;

public class Finda_average {
	public static void main(String[] args) {
		Scanner cout=new Scanner(System.in);
		System.out.print("Enter Number-1=");
		int number1=cout.nextInt();
		System.out.print("Enter Number-2=");
		int number2=cout.nextInt();
		System.out.print("Enter Number-3=");
		int number3=cout.nextInt();
		System.out.print("Enter Number-4=");
		int number4=cout.nextInt();
		System.out.print("Enter Number-5=");
		int number5=cout.nextInt();
		int Average_number;
		Average_number=(number1+ number2+number3+number4+number5)/5;
		System.out.print("Average of 5-Number is="+Average_number);
	
		
	}

}

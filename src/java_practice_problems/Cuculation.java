package java_practice_problems;

import java.util.Scanner;

public class Cuculation {
	public static void main(String[] args) {
		System.out.println("Performing Arithematic calculation");
		Scanner cin=new Scanner(System.in);
		System.out.print("Input first number: ");
		int A=cin.nextInt();
		System.out.print("Input second number: ");
		int B=cin.nextInt();
		System.out.println(A+"+"+B+"="+(A+B));
		System.out.println(A+"-"+B+"="+(A-B));
		System.out.println(A+"x"+B+"="+(A*B));
		System.out.println(A+"/"+B+"="+(A/B));
		System.out.println(A+"mod"+B+"="+(A%B));
		
		
		
	}

}

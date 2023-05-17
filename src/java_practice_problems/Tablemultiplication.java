package java_practice_problems;
import java.util.Scanner;

public class Tablemultiplication {
	public static void main(String[] args) {
		System.out.println("Table");
		System.out.print("Input nuber: ");
		Scanner cin=new Scanner(System.in);
		int A=cin.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println(A+"x"+i+"="+(A*i));
			i++;
		}
					
	}
	
}

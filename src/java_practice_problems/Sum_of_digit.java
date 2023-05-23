package java_practice_problems;
import java.util.Scanner;
public class Sum_of_digit
{
	public static void main(String[] args) 
	{
		Scanner cin=new Scanner(System.in);
		System.out.print("enter the Sume Digit number=");
		int v=cin.nextInt();
		sum(v);
	}

	private static void sum(int v) 
	{
		int sum=0;
		if(v>0) 
		{
			while(v>0)
			{
			int rem=v%10;
			sum=sum+rem;
			v=v/10;
			}
		}
		else 
		{
			while(v<0)
			{
			int rem=v%10;
			sum=sum+rem;
			v=v/10;
			}
			
		}
		
		System.out.print(sum);
	}

}

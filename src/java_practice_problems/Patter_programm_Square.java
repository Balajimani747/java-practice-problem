package java_practice_problems;

public class Patter_programm_Square
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("a");
			}
			for(int j=1;j<=i;j++) 
			{
				System.out.print("g ");
			}
			System.out.println(" ");
		}
	System.out.println("////////////////////////");
		for(int i=1;i<=n;i++) 
		{
			for(int j=i;j<=n;j++) 
			{
				System.out.print("k ");
			}
			System.out.println(" ");
		}
		
	}
}


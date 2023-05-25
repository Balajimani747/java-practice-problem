package java_practice_problems;

public class Display_unique_three_digit_number {
	public static void main(String[] args) 
	{
		int count=0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				for(int k=1;k<=4;k++) {
					if(i!=j && k!=j && k!=i) {
						count++;
						System.out.println(i + "" + j + "" + k);
					}
				}
			}
		}
		System.out.println("Total number of the three-digit-number is " + count);	
	}

}

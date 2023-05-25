package java_practice_problems;



public class Count_letters_spaces_numbers_String {

	public static void main(String[] args) 
	{
		
		String Sen="Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		Count(Sen);
		
	}


	private static void Count(String sen)
	{
		int letter=0;
		int space=0;
		int number=0;
		int other=0;
		int i;
		char[]c=sen.toCharArray();
		int len=c.length;
		for(i=0;i<len;i++) 
		{
			if(Character.isLetter(c[i]))
			{
				letter++;
			}
			else if(Character.isSpaceChar(c[i]))
			{
				space++;
			}
			else if(Character.isDigit(c[i]))
			{
				number++;
			}
			else {
				other++;
			}
			
		}
		System.out.println("Letter count in Giver Sting= "+letter);
		System.out.println("Number count in Giver Sting= "+number);
		System.out.println("Space count in Giver Sting= "+space);
		System.out.println("Special Character count in Giver Sting= "+other);
	}

}

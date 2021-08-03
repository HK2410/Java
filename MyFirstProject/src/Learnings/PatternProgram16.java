package Learnings;

public class PatternProgram16 {

	public static void main(String[] args) 
	{
		for(char row='A';row<='E';row++)
		{
			for(char col='A';col<=row;col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
		
		for(char row='D';row>='A';row--)
		{
			for(char col='A';col<=row;col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	}

}

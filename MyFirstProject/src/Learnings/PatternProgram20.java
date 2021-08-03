package Learnings;

public class PatternProgram20 {

	public static void main(String[] args) 
	{
		for(char row='E';row>='A';row--)
		{
		   for(char col ='A';col<=row;col++)
		   {
			System.out.print(col);
		   }
		   System.out.println();
	     }
		
		for(char row='B';row<='E';row++)
		{
			for(char col='A';col<=row;col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
}}

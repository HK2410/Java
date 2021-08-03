package Learnings;

public class PatternProgram17 {

	public static void main(String[] args) 
	{
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int row = 4;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

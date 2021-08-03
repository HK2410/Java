package Learnings;

public class PatternProgram22 {

	public static void main(String[] args) 
	{
		for(int row = 5;row>=1;row--)
		{
			for(int col = 1;col<=row;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int row=2;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

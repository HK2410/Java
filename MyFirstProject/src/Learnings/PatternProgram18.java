package Learnings;

public class PatternProgram18 {

	public static void main(String[] args) 
	{
		for(int row =5;row>=1;row--)
		{
			for(int col =1;col<=row;col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
		
		for(int row =1;row<=4;row++)
		{
			for(int col =1;col<=(row+1);col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	}

}

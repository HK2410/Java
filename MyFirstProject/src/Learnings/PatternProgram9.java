package Learnings;

public class PatternProgram9 {

	public static void main(String[] args)
	{
		for(int row=1;row<=7;row++)
		{
            for(int col = 1;col<row;col++)
            {
            	System.out.print(" ");
            }
		
			for(int col=row;col<=7;col++)
			{
				System.out.print(col);
			}
			
				System.out.println();
		}

}}

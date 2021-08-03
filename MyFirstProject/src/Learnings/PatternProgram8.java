package Learnings;

public class PatternProgram8{

	public static void main(String[] args)
	{
	    for(int row = 1;row<=7;row++)
	    {
		   for(int col = 1;col<=row-1;col++)
			{
				System.out.print(" ");
			} 
		   for(int col = row;col<=7;col++)
		    {
			System.out.print(col);
		    }
		    System.out.println();
	    }
		for(int row = 1;row<=6;row++)
		{
		    for(int col =1;col<=6-row;col++)
		    {
			   System.out.print(" ");
		    }
		    for(int col = (7-row);col<=7;col++)
		    {
			 System.out.print(col);
		    }
		    System.out.println();
	     }

}}


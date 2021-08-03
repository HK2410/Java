package Learnings;

public class PatternProgram23 {

	public static void main(String[] args)
	{
		int value = 0;
	for(int row=1;row<=4;row++)
	{  for(int col=1;col<=(4-row);col++)
	    {
	       System.out.print(" ");
	    }
	   for(int col=1;col<=row;col++)
		{
			System.out.print(col);
		}
		
	   for(int col = value;col>=1;col--)
		{
			System.out.print(col);
			
		}
        System.out.println();
        value++;
	}

}}

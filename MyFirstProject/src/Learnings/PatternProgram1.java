 package Learnings;

public class PatternProgram1 {

	public static void main(String[] args) {
	
	
	for(int row = 7;row>=1;row--)
	{	
		for(int col = 1;col<=row-1;col++)
		{
			System.out.print(1);
		}
	    for(int col=1;col<=(8-row);col++)
	    {
	    	System.out.print(8-row);
	    }
		System.out.println();
		
		
	}
}}


  
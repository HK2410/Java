package Learnings;

public class PatternProgram24 {

	public static void main(String[] args)
	{

		
		for(int row ='A';row<='E';row++)
		{
			for(int col='A';col<=(5-'A');col++)
			{
				System.out.print(" ");
			}
			
			for(int col='A';col<=row;col++)
			{  
				System.out.print(col);
				
			}
			
			//for(int col=row-1;col>='A';col--)
			//{   
			//	System.out.print(col);
			//	
			//}
			System.out.println();
		}

	}

}

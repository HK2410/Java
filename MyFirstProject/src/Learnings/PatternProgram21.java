package Learnings;

public class PatternProgram21 {

	public static void main(String[] args) 
	{

		for(char row='E';row>='A';row--)
		{	
		   for(char col = row;col>='A';col--)
		   {
			   System.out.print(col);
		   }
		   System.out.println();
		}
		
		for(char row='B';row<='E';row++)
		{
		   for(char col = row;col>='A';col--)
		   {
			   System.out.print(col);
		   }
		   System.out.println();
		}  
}}

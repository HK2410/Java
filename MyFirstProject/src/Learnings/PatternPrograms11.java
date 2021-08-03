package Learnings;

public class PatternPrograms11 {

	public static void main(String[] args) 
	{
	 for(char row ='A';row<='E';row++)
	 {	 
		for(char col ='E';col>=row;col--)
		{
			System.out.print(col);
		}
		System.out.println();
	 }

}}

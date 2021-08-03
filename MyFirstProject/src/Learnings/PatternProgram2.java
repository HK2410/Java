package Learnings;

public class PatternProgram2 {

	public static void main(String[] args)
	{
	for(int row=1;row<=7;row++)
	{	
		for(int col = 1;col<=row;col++)
		{
			System.out.print(col);
		}
		System.out.println();

	}
	for(int row=6;row>=1;row--)
	{
		for(int col = 1;col<=row;col++)
		{
			System.out.print(col);
		}
		System.out.println();
	}
}}

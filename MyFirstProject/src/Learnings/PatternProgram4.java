package Learnings;

public class PatternProgram4 {

	public static void main(String[] args) 
	{
	for(int row = 1;row<=7;row++)
	{
		for(int col = 7;col>=row;col--)
		{
			System.out.print(col);
		}
		System.out.println();
	}

}}

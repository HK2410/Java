package Learnings;

public class PatternProgram7 {

	public static void main(String[] args) {
	
	for(int row = 1;row<=7;row++)
	{
		for(int col = 1;col<=row;col++)
		{
			System.out.print(col);
		}
		for(int col = 1;col<=row-1;col++)
		{
			System.out.print((row - col));
		}
		System.out.println();
	}

}}

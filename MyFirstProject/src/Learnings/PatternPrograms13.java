package Learnings;

public class PatternPrograms13 {

	public static void main(String[] args) 
	{
		char value = 'A';
		
	for(int row = 1;row<=5;row++)
	{
		for(int col = 1;col<=row;col++)
		{
			System.out.print(value);
			value++;
		}
		System.out.println();
	}

}}
  
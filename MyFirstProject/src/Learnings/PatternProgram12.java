package Learnings;

public class PatternProgram12 {

	public static void main(String[] args) 
	{
		
     for(char row ='E';row>='A';row--)
     {
		for(char col='E';col>=row;col--)
		{
			System.out.print(col);
		}
		System.out.println();
	}

}
}
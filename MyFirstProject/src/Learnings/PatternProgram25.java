package Learnings;

public class PatternProgram25 {

	public static void main(String[] args)
	{
		
		int value=7;
		
		 for(int row=1;row<=5;row++)
		 {
			 for(int col=1;col<=row;col++)
			 {
				 System.out.print(" ");
			 }
			 for(int col=1;col<=1;col++)
			 {
				 System.out.print("*");
			 }
			 for(int col=1;col<=value;col++)
			 {
				 System.out.print(" ");
			 }
			 if(row==1||row==2||row==3||row==4) {
			for(int col = 1;col<=1;col++)
			{
				System.out.print("*");
			}}
		 System.out.println();
		 value=value-2;
		 }
		
		
		
		
		
		
		
	}
	
}
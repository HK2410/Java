package Learnings;

public class Factorial {
	public static void main(String[] args)
	{ 
   
	int fact = 1;
	int no = 5;
	
	while(no>0) {
		
	fact = fact*no;
	no--;
	}
	System.out.println(fact);
}
}


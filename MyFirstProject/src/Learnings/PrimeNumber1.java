package Learnings;

public class PrimeNumber1 {

	public static void main(String[] args) {
		int no = 13;
		int i = 2;
		int count = 0;
		while(i<=no/2) 
		{
		if(no%i==0)
		{
			count++;
		}
		i++;
		}
	 if(count==0)
		 System.out.println(no+"  is prime number");
	 else
		 System.out.println(no+"  is not prime number");
	}
} 

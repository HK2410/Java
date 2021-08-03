package Learnings;

public class Divisors {

	public static void main(String[] args) {
		int no = 100;
		int i = 2;
		int count =0;
		while(i<100)
		{
		if(no%i==0)
		{
			System.out.println(i+" is divisor of100");
			count++;
		}
		i++;
	}
		System.out.println(count);
	}
}

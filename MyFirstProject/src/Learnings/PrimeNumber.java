package Learnings;

public class PrimeNumber {

	public static void main(String[] args) {
	int no = 3;
	int counts = 0;
	while(no<=99) {
	int i = 2;
	int count = 0;
	while(i<no) {
		if(no%i==0)
		{
			count++;
		}	
	i++;}
	if(count==0)
	{
		System.out.println(no+" is prime number");
		counts++;
	}
    no++;
		
	} System.out.println(counts);
	
}}
 
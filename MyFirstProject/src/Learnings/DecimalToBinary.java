package Learnings;

public class DecimalToBinary {

	public static void main(String[] args) {
		int no = 9;
		String bin ="";
		while(no>=1) 
		{
		int rem = no%2;
		bin = rem + bin;
		no = no/2;

	}
		System.out.println(bin);

}}

package Learnings;

public class ReverseNumber {

	public static void main(String[] args) {
		int no = 1234;
		int rev = 0;
		while(no>0) {
		System.out.println(no%10);
		no = no/10;
	}

	}
}

package Learnings;

public class Divisibleby5 {

	public static void main(String[] args) {
		int no =1;
		while(no<=50) 
		{
			if(no%5==0 && no%10==0)
		{
			System.out.println(no);
		}
		no+=1;
		}
}
}
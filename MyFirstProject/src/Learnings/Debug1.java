package Learnings;

public class Debug1 {
	public static void main(String[] args) {
	

		int no = 2;
		while(no<25) 
		{
			int i =2;
			int count =0;
			while(i<no)
			
			{
				if(no%i==0)
				{
					count++;
				}
				i++;
			}
			if(count>0)
			{
				System.out.println(no  +" is not prime ");
				
			}
			else
			{
				System.out.println(no +"is prime");
			}
		no = no+1;}
	}


}

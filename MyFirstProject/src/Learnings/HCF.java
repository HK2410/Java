package Learnings;

public class HCF {

	public static void main(String[] args) {
		int no1 =12;
		int no2 = 36;
		int min;
		int hcf = 0;
		if(no1<no2)
		   min = no1;	
		
		else
		   min = no2;
		
		while(min>=2) {
			if(no1%min==0 && no2%min==0)
		{
			hcf = min;
			break;
		}
		min--;
		}
		System.out.println(hcf);
	}

}

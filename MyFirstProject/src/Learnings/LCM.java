package Learnings;

public class LCM {

	public static void main(String[] args) {
		int no1 = 9;
		int no2 = 15;
		int max;
		int lcm;
		if(no1>no2) 
			max = no1;
		
		else
		    max = no2;
		
		while(true) {
			if(max%no1==0 && max%no2==0) {
			lcm = max;
			break;}
			max++;}
		System.out.println(lcm);
}
}
	
	

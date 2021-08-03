package emiCalculation;

import java.util.Scanner;

public class Emi {

	public static void main(String[] args)
{    int salary,maxAmount,loanAmount;
	 float rateOfInterest,Interest,time,emi;
	    
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter salary");
     salary = sc.nextInt();
     
     maxAmount = 10*salary;
     System.out.println("Maximum loan given by bank is "+maxAmount);
     
     System.out.println("Enter required Loan Amount");
     loanAmount = sc.nextInt();
     
     System.out.println("Enter rate of interest per annum");
     rateOfInterest = sc.nextFloat();
     
     System.out.println("Enter required number of years to Repay the loan");
     time = sc.nextFloat();
     Interest = (rateOfInterest*loanAmount*time)/100;
     
     emi = (loanAmount + Interest)/(time*12); 
     System.out.println("Monthly emi is "+emi); 

	}
}

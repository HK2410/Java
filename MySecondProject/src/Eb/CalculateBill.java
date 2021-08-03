package Eb;

import java.util.Scanner;

public class CalculateBill extends EbTariff{

	

	public static void main(String[] args) 
	{
    double profit;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of units for two months");
	int units = sc.nextInt();
		
	CalculateBill b = new CalculateBill();
	double d1 = b.bill(units);
	System.out.println("Electricity bill for two months is "+d1);
		
	System.out.println("Enter number of number of units for first month");
	int units1 = sc.nextInt();
	double d2  = b.bill(units1);
	System.out.println("Electricity bill for first month is "+d2);
	
	System.out.println("Enter number of units for second month");
	int units2 = sc.nextInt();
	double d3  = b.bill(units2);
	System.out.println("Electricity bill for second month is "+d3);
	
	double d4 = d2+d3;
	System.out.println("Electrcity bill for first and second month is "+d4);
	profit = (d1-d4)/d1;
		
	
		
	System.out.println("profit is "+profit*100 +"percentage");
	
	}

}	
	




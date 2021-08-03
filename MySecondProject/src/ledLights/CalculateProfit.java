package ledLights;

import java.util.Scanner;

public class CalculateProfit extends Lights{

	public static void main(String[] args)
	{
	double TubeLightWatts = 40;
	double LedlightWatts  = 20;
	double profit;

	Scanner sc = new Scanner(System.in);
	CalculateProfit cp = new CalculateProfit();
	
	System.out.println("Enter number of hours taken by tubelight perday");
	double hours1 = sc.nextDouble();
	System.out.println("Enter number of years you want to use");
    double time1   = sc.nextDouble();
    System.out.println("Enter number of tubelights for "+time1+"years");
    int numberOfTubelights = sc.nextInt();
    double total1 = cp.Consumption(hours1,time1,TubeLightWatts) +
    		(rateOfTubelight*numberOfTubelights);
    System.out.println("total cost by using tubelight is "+total1);
 
    
	System.out.println("Enter number of hours taken by Ledlight perday");
	double hours2 = sc.nextDouble();
	System.out.println("Enter number of years you want to use");
    double time2  = sc.nextDouble();
    System.out.println("Enter number of Led tubelights for "+time2+"years");
    int numberOfLedLights =sc.nextInt();
    double total2 = cp.Consumption(hours2, time2, LedlightWatts)+
    		(rateOfLedlight*numberOfLedLights);
    System.out.println("total cost by using Ledlight is "+total2);
    
    
    profit = total1 - total2;
    System.out.println("profit by using Led is "+profit);
    
	}

}

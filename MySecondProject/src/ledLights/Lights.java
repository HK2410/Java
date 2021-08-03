package ledLights;

public class Lights 
{
	static int rateOfTubelight    = 100;
	static int rateOfLedlight     = 200;
	double units;
	double totalCost;
	double totalconsumption;
	
	public double Consumption(double hours,double time,double watts)
	{
		totalconsumption = (12*30*time*hours*watts);
	    units = totalconsumption/1000;
	    	if(units<=100) 
	    	{
	    		totalCost = units*0;
	    	}
	    	else if(units>100 && units<=200) 
	    	{
	    		totalCost = 100*0+(units-100)*1.5+20;	
	    	}
	    	else if(units>200 && units<=500)
	    	{
	    		totalCost = 100*0 + 100*1.5 +(units-200)*3 +30;
	    	}
	    	else 
	    	{
	    		totalCost = 100*0 + 100*3.5 +300*4.6 +(units-500)*6.6;
	    	}
	    	
	    return totalCost;
	}

}
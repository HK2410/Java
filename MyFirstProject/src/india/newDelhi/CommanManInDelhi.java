package india.newDelhi;

public class CommanManInDelhi implements TrafficRulesDelhi
{

	public static void main(String[] args)
	{
		CommanManInDelhi cd = new CommanManInDelhi();
		cd.dontGoByDieselVehicle();
		cd.goByBicycle();
	}

	
	public void dontGoByDieselVehicle()
	{
		System.out.println("No Diesel Vehicle");
		
	}

	
	public void goByBicycle() 
	{
		System.out.println("Bicycle in Delhi");
		
	}

}

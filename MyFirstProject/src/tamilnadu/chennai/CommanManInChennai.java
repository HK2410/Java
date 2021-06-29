package tamilnadu.chennai;

public  class CommanManInChennai implements TrafficRules 
{

	public static void main(String[] args)
	{
		CommanManInChennai cc = new CommanManInChennai();
		cc.goByBicycle();
		cc.goByDieselVehicle();

	}

	
	public void goByDieselVehicle() 
	{
		System.out.println("Diesel vehicle");
		
	}

	
	public void goByBicycle()
	{
		System.out.println("Bicycle in Chennai");
		
	}

}

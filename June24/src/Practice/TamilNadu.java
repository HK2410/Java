package Practice;

public class TamilNadu extends SouthIndia
{

public TamilNadu()
{
	super("Narendramodi");
}

static String capital = "Chennai";
	public void cultivate()
	{
		System.out.println("Rice and Sugarcane cultivation");
	}
	
	public void livingStyle()
	{
		System.out.println("Above Average development");
	}
	public void speakLanguage() 
	{
		
		System.out.println("speaking");
	}

	
	public void eat()
	{
		System.out.println("eating");

	}

	
	public void dress() 
	{
		System.out.println("dressing");

	}

	public static void main(String[] args) 
	{
		SouthIndia si = new TamilNadu();
	    System.out.println(India.Capital);
	    System.out.println(TamilNadu.capital);
	    si.cultivate();
	    si.dress();
	    si.eat();
	    si.livingStyle();
	    si.speakLanguage();
	    
	    
		

	}

}

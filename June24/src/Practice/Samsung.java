package Practice;

public class Samsung extends FactoryDemo 
{
	static int price = 5000;
	
	
	public void verifyFingerPrint()
	{
		System.out.println("verified");

	}

	public void providePattern() 
	{
		System.out.println("provided");

	}
	
	public int call(int seconds) 
	{
		
		return 0;
	}

	
	public void sendMessage()
	{
		
		System.out.println("sending");
	}

	
	public void receiveCall()
	{
		
		System.out.println("received");
	}

	public static void main(String[] args)
	{
		Samsung sam = new Samsung();
		sam.browse();
		System.out.println(sam.price);

	}

}

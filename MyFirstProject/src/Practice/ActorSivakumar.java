package Practice;

public class ActorSivakumar implements Actor
{
	static String address = "Coimbatore";
	public ActorSivakumar(int value, String name) 
	{
		
	}
	public ActorSivakumar()
	{
	
	}
	public static void main(String[] args)
	{
		ActorSivakumar as = new ActorSivakumar(65,"Audi Car");
		as.act();
		as.dance();
		as.sing();
		System.out.println(as.address);
		Actor ac = new ActorSivakumar();
		ac.act();
		ac.dance();
		ac.sing();
		System.out.println(ac.address);
	}
	public void speaking()
	{
		System.out.println("speaking");
	}
	
	public void act() 
	{
		System.out.println("acting");
		
	}

	public void dance()
	{
		System.out.println("dancing");
		
	}

	public void sing() 
	{
		System.out.println("singing");
		
	}

}

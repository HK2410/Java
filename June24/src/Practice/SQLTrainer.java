package Practice;

public class SQLTrainer extends Trainer 
{
	

	public SQLTrainer(String dept, String institute) 
	{
		super(dept,institute);
	}

	public static void main(String[] args)
	{
		SQLTrainer ram = new SQLTrainer("Mech","payilagam");
		System.out.println(ram.dept);
		System.out.println(ram.institute);
		ram.training();
		int sum = ram.getSalary();
		System.out.println(sum);
	}

}

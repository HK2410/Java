package Practice;

public class Trainer 
{
String dept = "Java";
String institute = "Payilagam";
private int salary = 10000;

public Trainer()
{
	System.out.println("constructor");
}
public Trainer(String dept, String institute)
{
	this.dept = dept;
	this.institute = institute;

}
public void training()
{
	System.out.println("training");
}
public static void main(String[] args)
{
	Trainer trainerKumar = new Trainer("CSE","Payilagam");
	
}
public int getSalary()
{
	return salary;
}
}

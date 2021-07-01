package Learnings;

public class NestedIf {

public static void main(String[] args) {
	int age = 20;
	int weight = 60;
	
	if(age>18)
	{
		if(weight>50)
		{
			System.out.println("you are eligible to donate blood");
		}
		
		else if(weight<50)
		{
			System.out.println("you are not eligible to donate blood");
		}
	}
	else
	{
		System.out.println("Age must be above 18");
	}
}
}


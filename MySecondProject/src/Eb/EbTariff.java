package Eb;

public class EbTariff 
{
double billpay;
public double bill(int units)
{
	if(units<=100) 
	{
		billpay = units*0;
	}
	else if(units>100 && units<=200) 
	{
		billpay = 100*0+(units-100)*1.5+20;	
	}
	else if(units>200 && units<=500)
	{
		billpay = 100*0 + 100*1.5 +(units-200)*3 +30;
	}
	else 
	{
		billpay = 100*0 + 100*3.5 +300*4.6 +(units-500)*6.6 + 50;
	}
	return billpay;
}
}

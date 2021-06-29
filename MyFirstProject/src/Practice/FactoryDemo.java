package Practice;

public abstract class FactoryDemo extends SmartPhone
{
boolean isOriginalPiece = false;
static int price = 0;

public abstract void verifyFingerPrint();

public abstract void providePattern();

public void browse()
{
	System.out.println("Factory Demo browsing");
}
	

}

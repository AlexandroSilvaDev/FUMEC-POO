package Questão_3;

public class Bird {

	protected static int referenceCount = 0;
	protected int a;
	
	protected void fly() 
	{
		System.out.print(" Flap Flap :" + a );
	}
	
	static int getRefCount() 
	{
		return referenceCount;
	}
}

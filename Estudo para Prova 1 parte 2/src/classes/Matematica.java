package classes;

public class Matematica {
	
	public static double soma( double a, double b )
	{
		return a + b;
	}
	
	public static double subtracao( double a, double b )
	{
		return a - b;
	}
	
	public static double multiplicacao( double a, double b )
	{
		return a * b;
	}
	
	public static double divisao( double a, double b )
	{
		if ( b != 0 )
		{
			return a / b;
		}
		return 0;
	}
	
	public static double funcao( double a, double b, double c )
	{	
		double x = soma(a,b);
		double y = multiplicacao(a,b);
		double z = subtracao(x,c);
		double h = multiplicacao(y,c);
		
		if ( h != 0 )
		{
			return divisao(z,h);
		}
		return 0;
		
		//return divisao( subtracao( soma(a, b), c ), multiplicacao( multiplicacao(a, b), c ) ); 
	}
}

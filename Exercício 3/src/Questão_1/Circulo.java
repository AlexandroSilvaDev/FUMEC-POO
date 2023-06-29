package Questão_1;

public class Circulo extends Circunferencia {

	public Circulo( float raio )
	{
		super(raio);
	}
	
	@Override
	public double perimetro()
	{
		return ( 2 * Math.PI * super.getRaio() );
	}
	
	@Override
	public double area()
	{
		return ( Math.PI * Math.pow(super.getRaio(), 2) );
	}
	
}

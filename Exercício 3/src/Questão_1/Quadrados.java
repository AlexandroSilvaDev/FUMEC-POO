package Questão_1;

public class Quadrados extends Quadrilateros {
	
	public Quadrados( double lado ) 
	{
		super(lado, lado, lado, lado);
	}

	@Override
	public double area() 
	{
		return super.getLado1() * super.getLado2();
	}
	
	public double getLado()
	{
		return getLado1();
	}
	
	/*
	@Override
	public String toString()
	{
		return "Lado: " + super.getLado1() + " Perímetro: " 
				+ perimetro() + " Área: " + area() + "\n";
	}
	*/
}

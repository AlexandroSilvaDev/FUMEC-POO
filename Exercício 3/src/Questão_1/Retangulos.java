package Questão_1;

public class Retangulos extends Quadrilateros {
	
	public Retangulos( float lado1, float lado2 )
	{
		super ( lado1, lado2, lado1, lado2 );
	}

	@Override
	public double area() {
		
		return getBase() * getAltura();
	}
	
	public double getBase()
	{
		return getLado1();
	}
	
	public double getAltura()
	{
		return getLado2();
	}
	
	/*
	@Override
	public String toString()
	{
		return "Base: " + getBase() + " Altura: " + getAltura() + " Perímetro: " 
				+ perimetro() + " Área: " + area() + "\n";
	}
	*/
}

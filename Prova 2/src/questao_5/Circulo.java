package questao_5;

public class Circulo extends Circunferencia {

	private double raio;
	
	public Circulo( double raio ) 
	{
		super(raio);
		this.raio = raio;
	}
	
	@Override
	public double area()
	{
		return 3.14 * (raio * raio);
	}

	@Override
	public String toString() 
	{
		return "Circulo [raio=" + raio + " Area: " + area() + 
				" Perimetro: " + perimetro() +"]\n";
	}
	
	
}

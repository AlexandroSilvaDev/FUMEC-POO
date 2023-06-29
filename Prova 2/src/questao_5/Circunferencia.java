package questao_5;

public abstract class Circunferencia implements FormaGeometrica {

	private double raio;
	
	public Circunferencia( double raio )
	{
		this.raio = raio;
	}
	
	@Override
	public double perimetro()
	{
		return 2 * 3.14 * raio;
	}
	
}

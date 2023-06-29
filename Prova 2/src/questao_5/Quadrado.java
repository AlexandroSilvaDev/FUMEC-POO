package questao_5;

public class Quadrado extends Quadrilatero {

	private double lado;
	
	public Quadrado( double lado ) 
	{
		super(lado, lado, lado, lado);
		this.lado = lado;
	}

	@Override
	public double area() 
	{
		return lado * lado;
	}

	@Override
	public String toString() 
	{
		return "Quadrado [lado=" + lado + " Area: " + area() + 
				" Perimetro: " + perimetro() +"]\n";
	}
	
}

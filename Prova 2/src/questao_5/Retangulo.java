package questao_5;

public class Retangulo extends Quadrilatero {

	private double lado;
	private double lado2;
	
	public Retangulo( double lado, double lado2 ) 
	{
		super(lado, lado2, lado, lado2);
		this.lado = lado;
		this.lado2 = lado2;
	}

	@Override
	public double area() 
	{
		return lado * lado2;
	}

	@Override
	public String toString() 
	{
		return "Retangulo [lado=" + lado + ", lado2=" + lado2 + 
				" Area: " + area() + " Perimetro: " + perimetro() + "]\n";
	}
	
}

package questao_5;

public abstract class Quadrilatero implements FormaGeometrica {

	private double lado;
	private double lado2;
	private double lado3;
	private double lado4;
	
	public Quadrilatero( double lado, double lado2, double lado3, double lado4 ) 
	{
		super();
		this.lado = lado;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}
	
	@Override
	public double perimetro()
	{
		return lado + lado2 + lado3 + lado4;
	}
}

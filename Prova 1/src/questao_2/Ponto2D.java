package questao_2;

public class Ponto2D {

	private double a;
	private double b;
	
	public Ponto2D()
	{
		setA(0);
		setB(0);
	}
	
	public Ponto2D( double a, double b )
	{
		this.a = a;
		this.b = b;
	}
	
	public Ponto2D( Ponto2D ponto )
	{
		this.a = ponto.getA();
		this.b = ponto.getB();
	}
	
	public void movimentacao()
	{
		setA(0);
		setB(0);
	}
	
	public void movimentacao( double a, double b )
	{
		this.a = a;
		this.b = b;
	}
	
	public void movimentacao( Ponto2D ponto )
	{
		this.a = ponto.getA();
		this.b = ponto.getB();
	}
	
	public boolean comparacao( Ponto2D ponto )
	{
		/*
		boolean valido = false;
		
		if ( ponto.getA() == a && ponto.getB() == b )
		{
			//System.out.println("\nOs pontos estão no mesmo lugar!");
			valido = true;
		}
		
		else {
			System.out.println("\nOs pontos não estão no mesmo lugar!");
		}
		*/
		
		return  ponto.getA() == a && ponto.getB() == b;
	}
	
	public double calcularDistancia( Ponto2D ponto )
	{
		double x = Math.pow( ponto.getA() - a, 2 ),
			   y = Math.pow( ponto.getB() - b, 2 );
		
		return Math.sqrt( x + y );
		
		//return Math.sqrt( Math.pow( a - ponto.getA(), 2 ) + Math.pow( b - ponto.getB(), 2 ) );
	}
	
	@Override
	public String toString() {
		return "A= " + this.a + ", B=" + b;
	}

	public double getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}

package Quest�o_1;

import Interface.FormaGeometrica;

public abstract class Circunferencia implements FormaGeometrica {
	
	private float raio;
	
	public Circunferencia( float raio )
	{
		this.raio = raio;
	}
	
	/*
	@Override
	public String toString()
	{
		return "Raio: " + raio + " Per�metro: " + perimetro() 
			+ " �rea: " + area() + "\n";
	}
	*/
	
	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}
}

package Questão_1;

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
		return "Raio: " + raio + " Perímetro: " + perimetro() 
			+ " Área: " + area() + "\n";
	}
	*/
	
	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}
}
